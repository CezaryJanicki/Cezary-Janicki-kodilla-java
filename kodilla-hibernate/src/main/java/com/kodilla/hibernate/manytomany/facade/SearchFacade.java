package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> findCompanyByAnyCharacter(String string) {
        return companyDao.findCompanyByAnyCharacter("%" + string + "%");
    }

    public List<Employee> findEmployeeByAnyCharacter(String string) {
        return employeeDao.findEmployeeByAnyCharacter("%" + string + "%");
    }
}
