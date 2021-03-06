package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.constant.GenericSearchCriteria;
import com.example.demo.projection.EmpDataTableDto;
import com.example.demo.projection.IncDataTableDto;

import reactor.core.publisher.Mono;


@RestController
public class ClientController {

	@Autowired
	private WebClient.Builder webClientBuilder;



	@CrossOrigin
	@PostMapping(path = "/employee/info")
	public ResponseEntity<EmpDataTableDto> getEmployeeInfo(@RequestBody GenericSearchCriteria genericSearchCriteria) {

		EmpDataTableDto dataTableDto = webClientBuilder.build().post().uri("http://employee-info-service/employee")
				.body(Mono.just(genericSearchCriteria), GenericSearchCriteria.class).retrieve()
				.bodyToMono(EmpDataTableDto.class).block();

		return new ResponseEntity<>(dataTableDto, HttpStatus.OK);
	}

	@CrossOrigin
	@PostMapping(path = "/incident/info")
	public ResponseEntity<IncDataTableDto> getIncidentInfo(@RequestBody GenericSearchCriteria genericSearchCriteria) {

		IncDataTableDto dataTableDto = webClientBuilder.build().post().uri("http://incident-info-service/incident")
				.body(Mono.just(genericSearchCriteria), GenericSearchCriteria.class).retrieve()
				.bodyToMono(IncDataTableDto.class).block();

		return new ResponseEntity<>(dataTableDto, HttpStatus.OK);
	}

}
