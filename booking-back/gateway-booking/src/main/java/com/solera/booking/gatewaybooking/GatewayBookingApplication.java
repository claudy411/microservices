package com.solera.booking.gatewaybooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayBookingApplication.class, args);
	}

}
