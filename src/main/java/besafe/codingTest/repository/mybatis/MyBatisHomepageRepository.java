package besafe.codingTest.repository.mybatis;

import besafe.codingTest.repository.HomepageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class MyBatisHomepageRepository implements HomepageRepository {
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
