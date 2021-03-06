package egovframework.msa.sample.controller;


import egovframework.msa.sample.service.CustomerRemoteService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogs")
public class CatalogsController {

    private final CustomerRemoteService customerRemoteService;

    public CatalogsController(@Qualifier("egovframework.msa.sample.service.CustomerRemoteService") CustomerRemoteService customerRemoteService) {
        this.customerRemoteService = customerRemoteService;
    }

    @GetMapping(path = "/customerinfo/{customerId}")
    public String getCustomerInfo(@PathVariable String customerId) {
        //기존 RestTemplate 사용하던 로직을 FeginClient로 변경
        String customerInfo = customerRemoteService.getCustomerInfo(customerId);
        System.out.println("response customerinfo = " + customerInfo);
        return String.format("[ Customer Id = %s at %s %s ]", customerId, System.currentTimeMillis(), customerInfo);
    }
}
