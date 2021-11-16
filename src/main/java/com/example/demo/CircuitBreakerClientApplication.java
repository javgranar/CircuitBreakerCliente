package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.Service;
import com.example.demo.entitySingleton.CocheSgt;

@SpringBootApplication
public class CircuitBreakerClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	Service service = new Service();
	
	String open = "open";
	String close = "close";
	String halfOpen = "half-open";
	CocheSgt coche = CocheSgt.getInstance();
	coche.setAceite(false);
	coche.setMotor(false);
	coche.setRuedas(false);
	coche.setStatus(open);
	
	for(int i=0; i < 10 && coche.getStatus().equals(open); i++) {
		coche.setStatus(halfOpen);
		service.setToHalfOpen();
		Thread.sleep(2000);
		if(i >= 3) {
			coche.setStatus(close);
			service.setToClose();
			Thread.sleep(2000);
		} else {
			coche.setStatus(open);
			service.setToClose();
			Thread.sleep(2000);
		}
	}
		
	}

}
