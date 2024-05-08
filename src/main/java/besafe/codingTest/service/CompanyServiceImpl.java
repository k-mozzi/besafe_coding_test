package besafe.codingTest.service;

import besafe.codingTest.repository.mybatis.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyMapper companyMapper;

    @Override
    public List<Map<String, Object>> findByNumOfSale(int offset) {
        return companyMapper.findByNumOfSale(offset);
    }
}
