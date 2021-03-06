package com.example.poc.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.poc.employee.entity.DataTableColumnEntity;

public interface DataTableColumnRepository extends CrudRepository<DataTableColumnEntity, Long>{
	
	<S extends DataTableColumnEntity> S save(S entity);

}
