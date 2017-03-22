package com.microservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ReservationClientApplication
{
  public static void main(String[] args) {
        SpringApplication.run(ReservationClientApplication.class, args);
    }
}


@RefreshScope
@RestController
@RequestMapping("/reservations")
class ReservationApiGatewayRestController {

    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    public String displayMessage()
    {
        return message;
    }



}


