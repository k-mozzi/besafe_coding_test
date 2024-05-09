package besafe.codingTest.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper {
    List<Integer> findRecommendedCompaniesByCategoryCdAndGpa(@Param("categoryCd") String categoryCd);
}
