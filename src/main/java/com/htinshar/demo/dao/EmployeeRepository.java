package com.htinshar.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.htinshar.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
