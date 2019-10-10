package com.data.table.client.projection;

import java.util.List;

public class IncDataTableDto {

	private List<String> avaliableColumn;

	private List<String> visibleColumn;

	private List<IncidentDto> incident;

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

	public List<IncidentDto> getIncident() {
		return incident;
	}

	public void setIncident(List<IncidentDto> incident) {
		this.incident = incident;
	}

		
	
}
