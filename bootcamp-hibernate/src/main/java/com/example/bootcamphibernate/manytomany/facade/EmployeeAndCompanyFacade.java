package com.example.bootcamphibernate.manytomany.facade;

import com.example.bootcamphibernate.manytomany.Company;
import com.example.bootcamphibernate.manytomany.Employee;
import com.example.bootcamphibernate.manytomany.dao.CompanyDao;
import com.example.bootcamphibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeAndCompanyFacade {

    private final CompanyDao companyDao;

    private final EmployeeDao employeeDao;

    public EmployeeAndCompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public Company findCompany(String name) {
        return companyDao.findByName(name);
    }

    public Employee findEmployee(String name) {
        return employeeDao.findByFirstname(name);
    }
}
