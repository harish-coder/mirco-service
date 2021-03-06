package com.example.poc.incident.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.incident.constant.GenericSearchCriteria;
import com.example.poc.incident.dao.IncidentDao;
import com.example.poc.incident.projection.IncDataTableDto;

@Service
public class IncidentService {

	@Autowired
	private IncidentDao incidentDao;
	
	@Autowired
	private DataTableColumnService columnService;
	
	public IncDataTableDto getIncidentInfo(GenericSearchCriteria searchCriteria){
		
		IncDataTableDto dataTableDto = new IncDataTableDto();
		dataTableDto.setIncident(incidentDao.getIncidentInfo(searchCriteria));
		dataTableDto.setAvaliableColumn(columnService.getAvaliableColumnInfo());
		dataTableDto.setVisibleColumn(columnService.getVisibleColumnInfo());
		return dataTableDto;
	}
}
