package besafe.codingTest.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseMapper {
    boolean existsContractForProduct(@Param("pId") int pId, @Param("uId") int uId);
}