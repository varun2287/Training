package com.niit.skill_mapper.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.skill_mapper.DAO.EmployeeDAO;
import com.niit.skill_mapper.model.Employee;
@Service

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public boolean addEmployee(Employee employee) {
		if(employeeDAO.getEmployeeById(employee.getEmployeeId())!=null) {
			return false;
		}
		else {
			employeeDAO.addEmployee(employee);
			return true;
		}}
		
		public boolean updateEmployee(Employee employee) {
		if(employeeDAO.getEmployeeById(employee.getEmployeeId())!=null) {	
			employeeDAO.updateEmployee(employee);
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean deleteEmployee(int employeeId) {
		if(employeeDAO.getEmployeeById(employeeId)!=null) {	
			employeeDAO.deleteEmployee(employeeId);
			return true;
		}
		else {
			return false;
		}
		
	}

	public List<Employee> getAllEmployees() {
		
		return employeeDAO.getAllEmployees();
	}

	public Employee getEmployeeById(int employeeId) {
		
		return employeeDAO.getEmployeeById(employeeId);
	}

	public List<Employee> getEmployeeBySkill(String empSkills) {
		
		return employeeDAO.getEmployeeBySkill(empSkills);
	}

	public List<Employee> getEmployeeByLocation(String location) {
		
		return employeeDAO.getEmployeeByLocation(location);
	}

	public List<Employee> getEmployeeByCert(String empCertification) {
		
		return employeeDAO.getEmployeeByCert(empCertification);
				
	}

	public boolean validateEmployee(String empMailId, String empPassword) {
		
	if(employeeDAO.validateEmployee(empMailId, empPassword)==true)
	{
		return true;
	}
	else
		{
		return false;
		}
		
	}
	

}
