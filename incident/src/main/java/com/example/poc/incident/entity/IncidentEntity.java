package com.example.poc.incident.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INCIDENT")
public class IncidentEntity implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INCIDENT_ID_SEQ")
	@SequenceGenerator(sequenceName = "INCIDENT_ID_SEQ", allocationSize = 1, name = "INCIDENT_ID_SEQ")
	@Column(name = "INCIDENT_ID")
	private Integer incidentId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PRIORITY_CODE")
	private String priorityCode;
	
	@Column(name = "SEVERITY_CODE")
	private String severityCode;
	
	@Column(name = "AUTHORCRE")
	private String authorCre;
	
	@Column(name = "AUTHORMAJ")
	private String authorMaj;
	
	@Column(name = "OPEN_GROUP")
	private String openGroup;
	
	@Column(name = "ASSIGNEE_NAME")
	private String assigneeName;

	public Integer getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(Integer incidentId) {
		this.incidentId = incidentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode;
	}

	public String getSeverityCode() {
		return severityCode;
	}

	public void setSeverityCode(String severityCode) {
		this.severityCode = severityCode;
	}

	public String getAuthorCre() {
		return authorCre;
	}

	public void setAuthorCre(String authorCre) {
		this.authorCre = authorCre;
	}

	public String getAuthorMaj() {
		return authorMaj;
	}

	public void setAuthorMaj(String authorMaj) {
		this.authorMaj = authorMaj;
	}

	public String getOpenGroup() {
		return openGroup;
	}

	public void setOpenGroup(String openGroup) {
		this.openGroup = openGroup;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	
	
	
}
