package com.solera.booking.bookingbooking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
@CrossOrigin
public class BookingController {

	@GetMapping()
	public String sayHi() {
		return "Hi Booking";
	}
}
