package com.example.poc.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.employee.dao.DataTableColumnDao;

@Service
public class DataTableColumnService {

	@Autowired
	private DataTableColumnDao dataTableColumnDao;
	
	public List<String> getAvaliableColumnInfo(){
		return dataTableColumnDao.getAvaliableColumnInfo();
	}
	
	public List<String> getVisibleColumnInfo(){
		return dataTableColumnDao.getVisibleColumnInfo();
	}
}
