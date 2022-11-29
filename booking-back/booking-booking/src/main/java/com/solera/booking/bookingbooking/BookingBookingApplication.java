package com.solera.booking.bookingbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookingBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingBookingApplication.class, args);
	}

}
