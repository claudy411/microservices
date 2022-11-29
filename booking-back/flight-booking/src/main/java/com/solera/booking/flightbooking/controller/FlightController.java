package com.solera.booking.flightbooking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
@CrossOrigin
public class FlightController {

	@GetMapping()
	public String sayHi() {
		return "Hi Flight";
	}
}
