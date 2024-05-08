package besafe.codingTest.controller;

import besafe.codingTest.service.CompanyService;
import lombok.Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Data
@RestController
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping("/homepage/general/main")
    public List<Map<String, Object>> getTopRatedCompanies(
            @RequestParam(name = "offset", defaultValue = "0") int offset) {
        return companyService.findByNumOfSale(offset);
    }
}
