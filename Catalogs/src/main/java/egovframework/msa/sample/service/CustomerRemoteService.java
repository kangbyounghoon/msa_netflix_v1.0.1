package egovframework.msa.sample.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "customer", url = "http://localhost:8082/")
public interface CustomerRemoteService {
    @RequestMapping(path = "/customers/{customerId}")
    String getCustomerInfo(@PathVariable String customerId);
}
