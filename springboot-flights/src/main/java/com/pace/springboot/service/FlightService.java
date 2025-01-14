package com.pace.springboot.service;

import com.pace.springboot.model.Flight;
import com.pace.springboot.repository.FlightRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository flightRepository;
	
	public List<Flight> getAllFlights(){
		List<Flight> flightList;
		
		flightList = (List<Flight>) flightRepository.findAll();
		for(Flight flight: flightList) {
			System.out.println(flight.getAirlinename());
		}
		return flightList;
	}
	
	public Flight getFlightById(long id) {
		return flightRepository.findById(id).get();
	}
	
	public void saveFlight(Flight flight) {
		flightRepository.save(flight);
	}
	public void updateFlight(Flight flight) {
		flightRepository.save(flight);
	}
	public void deleteFlight(long id) {
		flightRepository.deleteById(id);
	}
}
