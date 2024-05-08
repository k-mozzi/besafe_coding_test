package besafe.codingTest.controller;

import besafe.codingTest.service.HomepageService;
import lombok.Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Data
@RestController
@RequestMapping("/homepage")
public class HomepageController {
    private final HomepageService homepageService;

    /*
    * 최근 10일 동안 브랜딩 계약이 많은 상위 20개 업체 리스트 출력 메서드
    * Postman Body에 offset 입력
    * */
    @GetMapping("/general/main")
    public List<Map<String, Object>> getTopRatedCompanies(
            @RequestParam(name = "offset", defaultValue = "0") int offset) {
        return homepageService.findByNumOfSale(offset);
    }

    /*
     * 최근 10일 동안 브랜딩 신청이 많이 들어오고 아직 브랜딩 계약을 하지 않은 상위 20개 상품 리스트 출력 메서드
     * Postman Body에 offset 입력
     * */
    @GetMapping("/company/main")
    public List<Map<String, Object>> getTopRatedProducts(
            @RequestParam(name = "offset", defaultValue = "0") int offset) {
        return homepageService.findByNumOfRequest(offset);
    }
}
