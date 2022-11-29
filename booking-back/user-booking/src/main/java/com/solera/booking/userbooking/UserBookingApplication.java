package com.solera.booking.userbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBookingApplication.class, args);
	}

}
