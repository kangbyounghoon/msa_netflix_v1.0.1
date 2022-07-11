package egovframework.msa.sample.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "customer", fallback = CustomerRemoteServiceFallback.class)
public interface CustomerRemoteService {
    @RequestMapping(path = "/customers/{customerId}")
    String getCustomerInfo(@PathVariable String customerId);
}

@Component
class CustomerRemoteServiceFallback implements CustomerRemoteService {
    @Override
    public String getCustomerInfo(String customerId) {
        return "[ 고객정보 조회가 지연되고 있습니다. ]";
    }
}

