package com.htinshar.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.htinshar.demo.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{
	
}
