package besafe.codingTest.repository;

import java.util.List;
import java.util.Map;

public interface CompanyRepository {
    List<Map<String, Object>> findByNumOfSale(int offset);
}
