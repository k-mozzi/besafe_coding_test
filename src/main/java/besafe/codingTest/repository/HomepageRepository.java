package besafe.codingTest.repository;

import java.util.List;
import java.util.Map;

public interface HomepageRepository {
    List<Map<String, Object>> findByNumOfSale(int offset);

    List<Map<String, Object>> findByNumOfRequest(int offset);
}
