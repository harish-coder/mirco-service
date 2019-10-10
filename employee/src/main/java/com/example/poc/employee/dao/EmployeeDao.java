package com.example.poc.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.poc.employee.constant.GenericSearchCriteria;
import com.example.poc.employee.constant.Util;
import com.example.poc.employee.entity.EmployeeEntity;
import com.example.poc.employee.entity.JobsEnity;
import com.example.poc.employee.projection.EmployeeDto;

@Repository
@Transactional
public class EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<EmployeeDto> getAllEmpDetails(GenericSearchCriteria searchCriteria){
		StringBuilder query = new StringBuilder();
		String pattern = Util.getSearchString(searchCriteria);
		query.append("select new com.example.poc.employee.projection.EmployeeDto(emp.employeeId,"
				+ "emp.firstName,"
				+ "emp.lastName,"
				+ "emp.email,"
				+ "emp.phoneNumber,"
				+ "emp.hireDate,"
				+ "job.jobTitle,"
				+ "job.minSalary,"
				+ "job.maxSalary) "
				+ " from "+EmployeeEntity.class.getName()+" emp inner join "+JobsEnity.class.getName()+" job "
				+ " on emp.jobs = job.jobId where ");
		query.append(" lower(emp.employeeId) like  "+pattern);
		query.append("or lower(emp.firstName) like  "+pattern);
		query.append("or lower(emp.lastName) like  "+pattern);
		query.append("or lower(emp.email) like  "+pattern);
		query.append("or lower(emp.phoneNumber) like  "+pattern);
		query.append("or lower(job.jobTitle) like  "+pattern);
		query.append("or lower(job.minSalary) like  "+pattern);
		query.append("or lower(job.maxSalary) like  "+pattern);
		query.append(
				" order by " + searchCriteria.getSortingColumn() + " " + searchCriteria.getSortingType());
		List<EmployeeDto> empList=  entityManager.createQuery(query.toString(),EmployeeDto.class)
				.setMaxResults(searchCriteria.getPageSize())
				.setFirstResult(searchCriteria.getPageNumber() * searchCriteria.getPageSize()).getResultList();
		return (List<EmployeeDto>) empList;
	}
	
}
