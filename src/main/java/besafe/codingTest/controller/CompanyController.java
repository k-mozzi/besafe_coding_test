package besafe.codingTest.controller;

import besafe.codingTest.service.CompanyService;
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
public class CompanyController {
    private final CompanyService companyService;

    /*
    * 최근 10일 동안 브랜딩 계약이 많은 상위 20개 업체 출력 메서드
    * Postman Body에 offset 입력
    * */
    @GetMapping("/general/main")
    public List<Map<String, Object>> getTopRatedCompanies(
            @RequestParam(name = "offset", defaultValue = "0") int offset) {
        return companyService.findByNumOfSale(offset);
    }
}
