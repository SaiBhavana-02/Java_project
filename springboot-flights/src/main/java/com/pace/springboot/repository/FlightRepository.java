package com.pace.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.pace.springboot.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long>{

}
