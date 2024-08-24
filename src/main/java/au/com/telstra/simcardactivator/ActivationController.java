package au.com.telstra.simcardactivator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;


@RestController
public class ActivationController {

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }

//    private RestTemplate restTemplate;
    private final RestTemplate restTemplate;

    @Autowired
    public ActivationController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }


    @PostMapping("/activate")
    public void activate(@RequestBody CustomerRequest request) {
        InternalRequest internalRequest = new InternalRequest(request.getIccid());
        ActuatorResponse actuatorResponse = restTemplate.postForObject(
                "http://localhost:8444/actuate",
                internalRequest,
                ActuatorResponse.class);

        if (actuatorResponse != null && actuatorResponse.getSuccess()) {
            System.out.println("Your SIM is activated successfully.");
        } else {
            System.out.println("Your SIM can not be activated.");
        }


    }
}
