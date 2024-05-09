package besafe.codingTest.repository.mybatis;

import besafe.codingTest.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MyBatisPurchaseRepository implements PurchaseRepository {
    private final PurchaseMapper purchaseMapper;

    @Override
    public boolean existsContractForProduct(int pId) {
        return purchaseMapper.existsContractForProduct(pId);
    }
}
