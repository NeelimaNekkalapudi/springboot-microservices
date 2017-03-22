package com.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by nneelima on 3/20/2017.
 */
@RestController
@RequestMapping(value="/Seats")
public class SeatController {

   /* @Autowired
    SeatRepository repo;*/

    @Bean
    CommandLineRunner cmdLineRun(SeatRepository repo)
    {
        return strings -> {
            Stream.of("Neelima","Raj","Kumar").forEach(a -> repo.save(new Seats(a)));
        };
    }

  /*@RequestMapping(value="/", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Seats> getSeats()
    {
       return repo.findByName()findAll();
    }*/

}
