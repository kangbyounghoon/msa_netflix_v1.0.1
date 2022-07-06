package egovframework.msa.sample.controller;


import egovframework.msa.sample.service.CustomerAPIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogs")
public class CatalogsController {

    private final CustomerAPIService customerAPIService;

    public CatalogsController(CustomerAPIService customerAPIService) {
        this.customerAPIService = customerAPIService;
    }

    @GetMapping(path = "/customerinfo/{customerId}")
    public String getCustomerInfo(@PathVariable String customerId) {
        String customerInfo = customerAPIService.getCustomerDetail(customerId);
        System.out.println("response customerinfo = " + customerInfo);
        return String.format("[ Customer Id = %s at %s %s ]", customerId, System.currentTimeMillis(), customerInfo);
    }
}
