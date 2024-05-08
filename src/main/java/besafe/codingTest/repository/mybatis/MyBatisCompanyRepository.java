package besafe.codingTest.repository.mybatis;

import besafe.codingTest.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class MyBatisCompanyRepository implements CompanyRepository {
    private final CompanyMapper companyMapper;

    @Override
    public List<Map<String, Object>> findByNumOfSale(int offset) {
        return companyMapper.findByNumOfSale(offset);
    }
}
