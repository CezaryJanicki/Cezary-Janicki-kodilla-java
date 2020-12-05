package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Before
    public void createDatabase() {
        employeeDao.deleteAll();
        companyDao.deleteAll();

        Employee cezaryJanicki = new Employee("Cezary", "Janicki");
        Employee markStevens = new Employee("Mark", "Stevens");
        Employee markHamilton = new Employee("Mark", "Hamilton");
        Employee jessyJanicki = new Employee("Jessy", "Janicki");

        Company hirekIt = new Company("Hirek It");
        Company codeTwo = new Company("Code Two");
        Company oldAkslolotl = new Company("Old Alslolotl");

        cezaryJanicki.getCompanies().add(hirekIt);
        cezaryJanicki.getCompanies().add(codeTwo);
        markStevens.getCompanies().add(hirekIt);
        markStevens.getCompanies().add(codeTwo);
        markHamilton.getCompanies().add(codeTwo);
        markHamilton.getCompanies().add(oldAkslolotl);
        jessyJanicki.getCompanies().add(hirekIt);

        hirekIt.getEmployees().add(cezaryJanicki);
        hirekIt.getEmployees().add(markStevens);
        hirekIt.getEmployees().add(jessyJanicki);
        codeTwo.getEmployees().add(cezaryJanicki);
        codeTwo.getEmployees().add(markStevens);
        codeTwo.getEmployees().add(markHamilton);
        oldAkslolotl.getEmployees().add(markHamilton);

        companyDao.save(hirekIt);
        companyDao.save(codeTwo);
        companyDao.save(oldAkslolotl);
    }

    @Test
    public void testFindCompanyByAnyCharacter() {
        //Given

        //When
        List<Company> companies = searchFacade.findCompanyByAnyCharacter("%rek%");

        //Then
        Assert.assertEquals(1,companies.size());

        searchFacade.companyDao.deleteAll();
    }

    @Test
    public void testFindemployeeByAnyCharacter() {
        //Given

        //When
        List<Employee> employees = searchFacade.findEmployeeByAnyCharacter("%Jan%");
        //Then
        Assert.assertEquals(2, employees.size());

        searchFacade.employeeDao.deleteAll();
    }

}
