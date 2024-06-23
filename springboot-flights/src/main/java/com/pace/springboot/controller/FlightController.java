package com.pace.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pace.springboot.model.Flight;
import com.pace.springboot.service.FlightService;

@RestController
@RequestMapping("api/flights")
public class FlightController {
	@Autowired
	FlightService flightService;
	
	@GetMapping("/getallflights")
	private List<Flight> getAllFlights(){
		return flightService.getAllFlights();
	}
	
	@PostMapping("/addflight")
	private Long saveFlight(@RequestBody Flight flight) {
		flightService.saveFlight(flight);
		return flight.getId();
	}
	
	@GetMapping("/getflight/{id}")
	private Flight getFlights(@PathVariable("id") long id) {
		return flightService.getFlightById(id);
	}
	
	@PutMapping("/updateflight")
	private Flight update(@RequestBody Flight flight) {
		flightService.updateFlight(flight);
		return flight;
	}
	
	@DeleteMapping("/deleteflight/{id}")
	private void deleteFlight(@PathVariable("id") long id) {
		flightService.deleteFlight(id);
	}
}
