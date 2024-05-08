package besafe.codingTest.service;

import java.util.List;
import java.util.Map;

public interface CompanyService {
    List<Map<String, Object>> findByNumOfSale(int offset);
}
