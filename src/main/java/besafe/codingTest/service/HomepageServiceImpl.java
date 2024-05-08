package besafe.codingTest.service;

import besafe.codingTest.repository.mybatis.HomepageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class HomepageServiceImpl implements HomepageService {
    private final HomepageMapper homepageMapper;

    @Override
    public List<Map<String, Object>> findByNumOfSale(int offset) {
        return homepageMapper.findByNumOfSale(offset);
    }

    @Override
    public List<Map<String, Object>> findByNumOfRequest(int offset) {
        return homepageMapper.findByNumOfRequest(offset);
    }
}
