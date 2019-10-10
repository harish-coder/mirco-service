package com.example.poc.incident.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.poc.incident.constant.GenericConstant;
import com.example.poc.incident.entity.DataTableColumnEntity;

@Repository
@Transactional
public class DataTableColumnDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<String> getAvaliableColumnInfo(){
		StringBuilder query = new StringBuilder();
		query.append("select dataTableColumn.columnName from "+
		DataTableColumnEntity.class.getName()+" dataTableColumn "
		+ " where dataTableColumn.tableId="+GenericConstant.EMPLOYEE_TABLE+" and dataTableColumn.columnStatus="+GenericConstant.AVALIABLE_COLUMN);
		List<String> avaliableListInfo=  entityManager.createQuery(query.toString()).getResultList();
		return (List<String>) avaliableListInfo;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<String> getVisibleColumnInfo(){
		StringBuilder query = new StringBuilder();
		query.append("select dataTableColumn.columnName from "+
		DataTableColumnEntity.class.getName()+" dataTableColumn "
		+ " where dataTableColumn.tableId="+GenericConstant.EMPLOYEE_TABLE+" and dataTableColumn.columnStatus="+GenericConstant.VISIBLE_COLUMN);
		List<String> visibleColumnInfo=  entityManager.createQuery(query.toString()).getResultList();
		return (List<String>) visibleColumnInfo;
	}
}
