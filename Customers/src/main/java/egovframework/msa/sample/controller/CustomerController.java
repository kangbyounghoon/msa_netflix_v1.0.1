package egovframework.msa.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping(path = "/{customerId}")
    public String getCustomerDetail(@PathVariable String customerId) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("request customerId = " + customerId);
        return "[Customer id = " + customerId + " at " + System.currentTimeMillis() + "]";
    }
}
