package com.example.demo.projection;

import java.util.List;

public class EmpDataTableDto {

	private List<String> avaliableColumn;

	private List<String> visibleColumn;

	private List<EmployeeDto> employee;
	
	

	public List<String> getAvaliableColumn() {
		return avaliableColumn;
	}

	public void setAvaliableColumn(List<String> avaliableColumn) {
		this.avaliableColumn = avaliableColumn;
	}

	public List<String> getVisibleColumn() {
		return visibleColumn;
	}

	public void setVisibleColumn(List<String> visibleColumn) {
		this.visibleColumn = visibleColumn;
	}

	public List<EmployeeDto> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeDto> employee) {
		this.employee = employee;
	}

}
