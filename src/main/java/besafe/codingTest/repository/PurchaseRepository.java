package besafe.codingTest.repository;

import org.apache.ibatis.annotations.Param;

public interface PurchaseRepository {
    boolean existsContractForProduct(@Param("pId") int pId);
}
