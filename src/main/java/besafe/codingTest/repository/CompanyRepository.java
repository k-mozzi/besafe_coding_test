package besafe.codingTest.repository;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyRepository {
    List<Integer> findRecommendedCompaniesByCategoryCdAndGpa(@Param("categoryCd") String categoryCd);
}
