package com.niit.skill_mapper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.skill_mapper.model.Employee;
import com.niit.skill_mapper.config.AppContext;
import com.niit.skill_mapper.services.EmployeeService;

import junit.framework.AssertionFailedError;
@RunWith(SpringRunner.class )
@SpringJUnitConfig(classes=AppContext.class)
public class EmployeeTest {
@Autowired
private EmployeeService employeeService;
Employee employee;
@Before
public void init()
{
}
	@Test
	public void testAddEmployeeSuccess() {
		
		employee.setEmployeeId(1001);
		employee.setEmpName("Rahul");
	    assertEquals(true,employeeService.addEmployee(employee));
		
	}

@Test
public void testAddEmployeeFail()
{
assertFalse(false);	
}

@Test
public void updateEmployee(Employee employee)
{
        employee.setEmpCity("bombay");
        employee.setEmpExperience(3);

	assertEquals(employee,employeeService.updateEmployee(employee));
	
}
public void updateEmployeeFalse()
{
	assertFalse(false);
	
}




}
