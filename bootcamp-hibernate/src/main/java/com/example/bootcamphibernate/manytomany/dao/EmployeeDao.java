package com.example.bootcamphibernate.manytomany.dao;

import com.example.bootcamphibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    Employee findByFirstname(String name);
}
