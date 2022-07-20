package com.farhan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.farhan.entities.Employee;
import com.farhan.exceptions.EmployeeException;
import com.farhan.utilities.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployee() {
		EntityManager em = EMUtil.provideEntityManager();
		String jpql = "from Employee";
		Query q = em.createQuery(jpql);
		List<Employee> list = q.getResultList();
		return list;
	}

	@Override
	public String getAddressOfEmployee(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee e = em.find(Employee.class, empId);
		if (e != null)
			return e.getAddress();
		else
			throw new EmployeeException("Not Found...");
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee e = em.find(Employee.class, empId);
		if (e != null) {
			e.setSalary(e.getSalary() + bonus);
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			return "Bonus added successfully";
		} else {
			throw new EmployeeException("Not Found...");
		}
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee e = em.find(Employee.class, empId);
		if (e != null) {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			return true;
		} else
			throw new EmployeeException("Employee not found...");
	}

	@Override
	public String[] getNameAndAddress(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee e = em.find(Employee.class, empId);
		if (e != null)
			return (new String[] { e.getName(), e.getAddress() });
		else
			throw new EmployeeException("Not Found...");
	}

	@Override
	public String addEmployee(Employee e) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee temp = em.find(Employee.class, e.getEmpId());
		if (temp != null)
			throw new EmployeeException("Employee already exists...");
		else {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			return "Employee added successfully";
		}
	}

}
