package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.service.RegistrationService;

@Controller
public class MVCController 
{
	@Autowired
	private RegistrationService ser;
	public MVCController() 
	{
		System.out.println("Front Contoller Created...");
	}
	
	@RequestMapping(value =  "/")
	public String homePage()
	{
		return "employeeRegistration.jsp";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView registerForm(Employee e)
	{
		ser.employeeRegistrationService(e);
		return new ModelAndView("success.jsp").addObject("success", "Employee Details Successfully Inserted");
		
	}
	@RequestMapping(value = "/showAllEmployee")
	public ModelAndView showAllEmployee()
	{
		List<Employee> allEmployee = ser.showEmployeeservice();
		
		return new ModelAndView("allEmployee.jsp").addObject("Employes", allEmployee);
		
	}
}

