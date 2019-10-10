package com.example.poc.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.employee.constant.GenericSearchCriteria;
import com.example.poc.employee.dao.EmployeeDao;
import com.example.poc.employee.projection.EmpDataTableDto;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DataTableColumnService columnService;
	
	public EmpDataTableDto getAllEmpDetails(GenericSearchCriteria searchCriteria) {
		EmpDataTableDto dataTableDto = new EmpDataTableDto();
		dataTableDto.setEmployee(employeeDao.getAllEmpDetails(searchCriteria));
		dataTableDto.setAvaliableColumn(columnService.getAvaliableColumnInfo());
		dataTableDto.setVisibleColumn(columnService.getVisibleColumnInfo());
		return dataTableDto;
	}
}
