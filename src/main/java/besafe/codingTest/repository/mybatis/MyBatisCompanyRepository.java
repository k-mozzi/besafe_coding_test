package besafe.codingTest.repository.mybatis;

import besafe.codingTest.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyBatisCompanyRepository implements CompanyRepository {
    private final CompanyMapper companyMapper;

    @Override
    public List<Integer> findRecommendedCompaniesByCategoryCdAndGpa(String categoryCd) {
        return companyMapper.findRecommendedCompaniesByCategoryCdAndGpa(categoryCd);
    }
}
