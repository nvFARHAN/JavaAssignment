package com.farhan.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.farhan.bean.Address;
import com.farhan.bean.Employee;
import com.farhan.utilities.EMUtil;

public class Main {

	public static void main(String[] args) {
		EntityManager em = EMUtil.getEntityManger();
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee();
		emp.setName("Ram");
		emp.setGender("Male");
		emp.setSalary(7800);

		emp.getEmpAddress().add(new Address("st1", "ct1", "78754", "Office"));
		emp.getEmpAddress().add(new Address("st2", "ct2", "58754", "Home"));

		list.add(emp);
		list.add(emp);
		list.add(emp);
		list.add(emp);
		for (Employee e : list) {
			em.getTransaction().begin();

			em.persist(e);

			em.getTransaction().commit();
		}

		System.out.println("done...");
	}

}
