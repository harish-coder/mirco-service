package com.example.poc.incident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.incident.constant.GenericSearchCriteria;
import com.example.poc.incident.projection.IncDataTableDto;
import com.example.poc.incident.service.IncidentService;


@RestController
public class IncidentController {

	
	@Autowired
	private IncidentService incidentService;
	
	

	@CrossOrigin
	@PostMapping(path ="/incident")
	public ResponseEntity<IncDataTableDto> getAllEmpDetails(@RequestBody GenericSearchCriteria searchCriteria){
		IncDataTableDto incDataTable = incidentService.getIncidentInfo(searchCriteria);
		return new ResponseEntity<IncDataTableDto>(incDataTable, HttpStatus.OK);
	}
}
