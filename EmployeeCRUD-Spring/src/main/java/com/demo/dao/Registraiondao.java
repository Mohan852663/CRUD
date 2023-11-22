package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class Registraiondao 
{
	@Autowired
	private SessionFactory fact;
	public Registraiondao() {
		System.out.println("DAO object Created...");
	}
	//create 
	public void employeeRegistrationDAO(Employee e)
	{
		Session session=fact.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		System.out.println("Employee Session Created...");
		session.close();
		
	}
	//read
	public List<Employee> showEmployeedao()
	{
		Session session = fact.openSession();
		List<Employee> allEmployee = session.createQuery("from Employee").getResultList();
		return allEmployee;
		
	}

}
