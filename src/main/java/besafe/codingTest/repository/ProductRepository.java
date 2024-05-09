package besafe.codingTest.repository;

import besafe.codingTest.domain.product.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductRepository {
    List<Product> findUserProducts(@Param("uId") int uId);
}
