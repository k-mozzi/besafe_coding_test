package besafe.codingTest.repository.mybatis;

import besafe.codingTest.domain.product.Product;
import besafe.codingTest.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyBatisProductRepository implements ProductRepository {
    private final ProductMapper productMapper;

    @Override
    public List<Product> findUserProducts(int uId) {
        return productMapper.findUserProducts(uId);
    }
}
