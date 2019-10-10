package com.example.poc.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.poc.employee.entity.EmployeeEntity;

public interface EmployeeRpository extends CrudRepository<EmployeeEntity, Long> {

}
