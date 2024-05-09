package besafe.codingTest.controller;

import besafe.codingTest.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl productService;

    @GetMapping("/recommendation")
    public ResponseEntity<List<Map<String, Object>>> getProductsWithRecommendations(@RequestParam String uId) {
        try {
            List<Map<String, Object>> productsWithRecommendations = productService.getProductsWithRecommendations(uId);
            return ResponseEntity.ok(productsWithRecommendations);
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
