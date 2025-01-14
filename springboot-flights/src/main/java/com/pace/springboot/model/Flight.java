package com.pace.springboot.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="details")
public class Flight {
	@Id
	@Column
	private Long id;
	@Column
	private String Flightnum;
	@Column
	private String Airlinename;
	@Column
	private String origin;
	@Column
	private String destination;
	@Column
	private LocalDateTime departureTime;
	@Column
    private LocalDateTime arrivalTime;
	@Column
	private String Pilotname;
	@Column
	private String co_pilotname;
	@Column
	private String cabinCrew;
  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightnum() {
		return Flightnum;
	}
	public void setFlightnum(String flightnum) {
		Flightnum = flightnum;
	}
	public String getAirlinename() {
		return Airlinename;
	}
	public void setAirlinename(String airlinename) {
		Airlinename = airlinename;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPilotname() {
		return Pilotname;
	}
	public void setPilotname(String pilotname) {
		Pilotname = pilotname;
	}
	public String getCo_pilotname() {
		return co_pilotname;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public void setCo_pilotname(String co_pilotname) {
		this.co_pilotname = co_pilotname;
	}
	public String getCabinCrew() {
		return cabinCrew;
	}
	public void setCabinCrew(String cabinCrew) {
		this.cabinCrew = cabinCrew;
	}
}