package egovframework.msa.sample.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import egovframework.msa.sample.service.CustomerAPIService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerAPIServiceImpl implements CustomerAPIService {

//    public static final String url = "http://localhost:8082/customers/";
    public static final String url = "http://product/customers/";
    private final RestTemplate restTemplate;

    public CustomerAPIServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "getCustomerDetailFallback")
    @Override
    public String getCustomerDetail(String customerId) {
//        return customerId;
        return restTemplate.getForObject(url + customerId, String.class);
    }

    public String getCustomerDetailFallback(String customerId, Throwable ex) {
        System.out.println("getCustomerDetailFallback CustomerId = " + customerId + " Error : " + ex.getMessage());
        return "[고객정보 조회가 지연되고 있습니다.]";
    }
}
