package besafe.codingTest.service;

import java.util.List;
import java.util.Map;

public interface HomepageService {
    List<Map<String, Object>> findByNumOfSale(int offset);

    List<Map<String, Object>> findByNumOfRequest(int offset);
}
