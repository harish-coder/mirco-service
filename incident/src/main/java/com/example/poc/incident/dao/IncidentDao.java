package com.example.poc.incident.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.poc.incident.constant.GenericSearchCriteria;
import com.example.poc.incident.constant.Util;
import com.example.poc.incident.entity.IncidentEntity;

@Repository
@Transactional
public class IncidentDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<IncidentEntity> getIncidentInfo(GenericSearchCriteria searchCriteria){
		StringBuilder query = new StringBuilder();
		String pattern = Util.getSearchString(searchCriteria);
		query.append("select incident from "+IncidentEntity.class.getName()+" incident where ");
		query.append(" lower(incident.incidentId) like  "+pattern);
		query.append(" or lower(incident.status) like  "+pattern);
		query.append(" or lower(incident.category) like  "+pattern);
		query.append(" or lower(incident.description) like  "+pattern);
		query.append(" or lower(incident.priorityCode) like  "+pattern);
		query.append(" or lower(incident.severityCode) like  "+pattern);
		query.append(" or lower(incident.authorCre) like  "+pattern);
		query.append(" or lower(incident.authorMaj) like  "+pattern);
		query.append(" or lower(incident.openGroup) like  "+pattern);
		query.append(" or lower(incident.assigneeName) like  "+pattern);
		
		query.append(
				" order by " + searchCriteria.getSortingColumn() + " " + searchCriteria.getSortingType());
		return entityManager.createQuery(query.toString(),IncidentEntity.class)
				.setMaxResults(searchCriteria.getPageSize())
				.setFirstResult(searchCriteria.getPageNumber() * searchCriteria.getPageSize()).getResultList();
	}
}
