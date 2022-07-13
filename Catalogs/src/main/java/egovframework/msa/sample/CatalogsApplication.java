package egovframework.msa.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
@ComponentScan("egovframework.*")
@SpringBootApplication
public class CatalogsApplication {

    public static void main(String[] args) {
        String profile = System.getProperty("spring.profiles.active");
        if (profile == null) {
            System.setProperty("spring.profiles.active", "dev");
        }

        System.out.println("Catalogs profile real mode ======== " + System.getProperty("spring.profiles.active"));
        SpringApplication.run(CatalogsApplication.class, args);
    }

}
