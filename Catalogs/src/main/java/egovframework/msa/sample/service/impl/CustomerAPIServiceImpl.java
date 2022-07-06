package egovframework.msa.sample.service.impl;

import egovframework.msa.sample.service.CustomerAPIService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerAPIServiceImpl implements CustomerAPIService {

    private final RestTemplate restTemplate;

    public CustomerAPIServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getCustomerDetail(String customerId) {
//        return customerId;
        return restTemplate.getForObject("http://localhost:8082/customers/" + customerId, String.class);
    }
}
