package com.niit.skill_mapper.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.cj.Query;
import com.niit.skill_mapper.model.Employee;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int employeeId) {
		sessionFactory.getCurrentSession().delete(getEmployeeById(employeeId));

		return true;
	}

	public List<Employee> getAllEmployees() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();

	}

	public Employee getEmployeeById(int employeeId) {
		Employee employee= (Employee) sessionFactory.getCurrentSession()
				.createQuery("from Employee where employeeId='"+employeeId+"'");
		return employee;
	}

	public List<Employee> getEmployeeBySkill(String empSkills) {

		return sessionFactory.getCurrentSession().createQuery("from Employee where keyskills like '"+empSkills+"'").list();
	}

	public List<Employee> getEmployeeByLocation(String location) {

		return sessionFactory.getCurrentSession().createQuery("from Employee where location='"+location+"'").list();

	}

	public List<Employee> getEmployeeByCert(String empCertification) {

		return sessionFactory.getCurrentSession().createQuery("from Employee where certification='"+empCertification+"'")
				.list();
	}

	public boolean validateEmployee(String empMailId,String empPassword) {
org.hibernate.Query query=sessionFactory.getCurrentSession().createQuery("from Employee where email='"+empMailId+"' and empPassword='"+empPassword+"'");
Employee employee=(Employee)query.uniqueResult();
if(employee!=null)
{
	return true;
}
else
{
	return false;
	}
	}
}
