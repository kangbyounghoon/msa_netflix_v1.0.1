package egovframework.msa.sample.service.impl;

import egovframework.msa.sample.service.CustomerAPIService;
import org.springframework.stereotype.Service;

@Service
public class CustomerAPIServiceImpl implements CustomerAPIService {

    @Override
    public String getCustomerDetail(String customerId) {
        return customerId;
    }
}
