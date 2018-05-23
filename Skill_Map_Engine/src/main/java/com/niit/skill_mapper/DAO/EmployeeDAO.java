package com.niit.skill_mapper.DAO;

import java.util.List;

import com.niit.skill_mapper.model.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int employeeId);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int employeeId);
	public List<Employee> getEmployeeBySkill(String empSkills);
	public List<Employee> getEmployeeByLocation(String location);
	public List<Employee> getEmployeeByCert(String empCertification);
	public boolean validateEmployee(String empMailId,String empPassword);

}
