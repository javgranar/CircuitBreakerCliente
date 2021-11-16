package com.example.demo.controller;

import java.net.URI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entitySingleton.CocheSgt;


@SpringBootApplication
public class Service {
		
	RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/";
	String open = "open";
	String close = "close";
	String haftOpen = "halfopen";
	
	public String setToOpen() {
		String resourceUrl = url+open;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(resourceUrl), String.class);
		return response.getBody();
	}
	
	public String setToClose() {
		String resourceUrl = url+close;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(resourceUrl), String.class);
		return response.getBody();
	}
	
	public String setToHalfOpen() {
		String resourceUrl = url+haftOpen;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(resourceUrl), String.class);
		return response.getBody();
	}

}
