package besafe.codingTest.service;

import besafe.codingTest.domain.product.Product;
import besafe.codingTest.repository.mybatis.CompanyMapper;
import besafe.codingTest.repository.mybatis.ProductMapper;
import besafe.codingTest.repository.mybatis.PurchaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

    private final PurchaseMapper purchaseMapper;

    private final CompanyMapper companyMapper;

    public List<Map<String, Object>> getProductsWithRecommendations(String uId) {
        int userId = Integer.parseInt(uId);

        // 사용자가 소유한 상품 리스트 가져오기
        List<Product> userProducts = productMapper.findUserProducts(userId);

        // 계약하지 않은 상품들 필터링
        List<Product> nonContractProducts = userProducts.stream()
                .filter(product -> !purchaseMapper.existsContractForProduct(product.getPId(), userId))
                .collect(Collectors.toList());

        // 결과를 저장할 리스트 초기화
        List<Map<String, Object>> result = new ArrayList<>();

        // 추천 업체 목록 생성
        for (Product product : nonContractProducts) {
            List<Integer> recommendedCompanyIds = companyMapper.findRecommendedCompaniesByCategoryCdAndGpa(product.getCategoryCd());
            Map<String, Object> productWithRecommendations = new HashMap<>();
            productWithRecommendations.put("product", product);
            productWithRecommendations.put("recommendedCompanyIds", recommendedCompanyIds);
            result.add(productWithRecommendations);
        }

        return result;
    }
}
