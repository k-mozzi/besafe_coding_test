package besafe.codingTest.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CompanyMapper {
    List<Map<String, Object>> findByNumOfSale(int offset);
}
