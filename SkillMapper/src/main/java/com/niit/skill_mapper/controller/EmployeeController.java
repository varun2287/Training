package com.niit.skill_mapper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.skill_mapper.DAO.EmployeeDAO;
import com.niit.skill_mapper.model.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
@Autowired
private EmployeeDAO employeeDAO;
@GetMapping("/employees")
public ResponseEntity<?> getAllEmployees()
{
	List<Employee> list =employeeDAO.getAllEmployees();
	if(list!=null)
	{
	return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);	
	}
	else 
	{
		return new ResponseEntity<String>("No Employee Found",HttpStatus.NO_CONTENT);
	}
}
@PostMapping("/save")
public ResponseEntity<?> addEmployee(@RequestBody Employee employee)
{
	boolean status=employeeDAO.addEmployee(employee);
	
	return new ResponseEntity<String>("Employee Saved Successfully",HttpStatus.CREATED);
	
}
@PostMapping("/delete{employeeId}")
public ResponseEntity<?>deleteEmployee(@PathVariable("employeeId") int employeeId)
{
	boolean status=employeeDAO.deleteEmployee(employeeId);
	return new ResponseEntity<String>("Employee Deleted Successfully",HttpStatus.OK);
}

@GetMapping("/employee{employeeId}")
public ResponseEntity<?> employeeById(@PathVariable("employeeId") int employeeId)
{
	Employee employee =employeeDAO.getEmployeeById(employeeId);
	return new ResponseEntity<Employee>(employee,HttpStatus.OK);
}

@PostMapping("/update")
public ResponseEntity<?> updateEmployee(@RequestBody Employee employee)
{
	employeeDAO.updateEmployee(employee);
	return new ResponseEntity<Employee>(employee,HttpStatus.OK);
}
@PostMapping("/login")
public ResponseEntity<?> loginEmployee(@RequestBody Employee employee)
{
	boolean status=employeeDAO.validateEmployee(employee.getEmpMailId(),employee.getEmpPassword());
	if(status)
	{
		return new ResponseEntity<String>("Login Successful",HttpStatus.OK);
	}
	else
	{
		return  new ResponseEntity<String>("Invalid ",HttpStatus.NOT_FOUND);
		
	}
}
	



}
