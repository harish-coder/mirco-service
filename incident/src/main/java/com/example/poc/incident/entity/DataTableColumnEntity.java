package com.example.poc.incident.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATA_TABLE_COLUMN")
public class DataTableColumnEntity implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="COLUMN_ID")
	private Long columnId;
	
	@Column(name = "COLUMN_NAME")
	private String columnName;

	@Column(name ="COLUMN_STATUS")
	private Long columnStatus;
	
	@Column(name ="TABLE_ID")
	private Long tableId;

	public Long getColumnId() {
		return columnId;
	}

	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Long getColumnStatus() {
		return columnStatus;
	}

	public void setColumnStatus(Long columnStatus) {
		this.columnStatus = columnStatus;
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
	
	
	
	
}
