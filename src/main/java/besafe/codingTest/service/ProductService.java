package besafe.codingTest.service;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Map<String, Object>> getProductsWithRecommendations(String uId);
}
