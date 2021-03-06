package com.example.poc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.employee.constant.GenericSearchCriteria;
import com.example.poc.employee.projection.EmpDataTableDto;
import com.example.poc.employee.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@CrossOrigin
	@PostMapping(path ="/employee")
	public ResponseEntity<EmpDataTableDto> getAllEmpDetails(@RequestBody GenericSearchCriteria searchCriteria){
		EmpDataTableDto empDataTable = employeeService.getAllEmpDetails(searchCriteria);
		return new ResponseEntity<EmpDataTableDto>(empDataTable, HttpStatus.OK);
	}
}
