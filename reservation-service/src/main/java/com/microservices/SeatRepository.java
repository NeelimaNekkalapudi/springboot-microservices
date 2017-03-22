package com.microservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by nneelima on 3/20/2017.
 */
@RepositoryRestResource
public interface SeatRepository extends JpaRepository<Seats,Integer> {

    @RestResource(path = "by-name")
    public List<Seats> findByName(@Param("name")String name);
}
