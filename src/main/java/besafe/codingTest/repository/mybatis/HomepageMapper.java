package besafe.codingTest.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HomepageMapper {
    List<Map<String, Object>> findByNumOfSale(int offset);

    List<Map<String, Object>> findByNumOfRequest(int offset);
}
