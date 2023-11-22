package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Registraiondao;
import com.demo.model.Employee;

@Service
public class RegistrationService 
{
	@Autowired
	private Registraiondao dao;
	

	public RegistrationService() {
		System.out.println("Service Object Created....");
	}
	
	public void employeeRegistrationService(Employee e)
	{
		dao.employeeRegistrationDAO(e);
	}
	
	public List<Employee> showEmployeeservice()
	{
		List<Employee> allEmployee = dao.showEmployeedao();
		return allEmployee; 
	}
	
	
}
