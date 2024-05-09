package besafe.codingTest.repository.mybatis;

import besafe.codingTest.domain.product.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findUserProducts(@Param("uId") int uId);
}
