package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.RegistrationService;

@Controller
public class MVCController 
{
	@Autowired
	private  RegistrationService ser;
	public MVCController() {
		System.out.println("Front - Controller Invoked...");
	}
	
	@RequestMapping(value = "/")
	public String homePage()
	{
		return "registration.jsp";
	}
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView registerForm(Student s)
	{
		ser.studentRegistrationService(s);
		return new ModelAndView("success.jsp").addObject("success", "record successfully inserted");
	}
	@RequestMapping(value = "/viewAllStudents")
	public ModelAndView viewAllStudents()
	{
		List<Student> allStudents=ser.viewAllStudentsService();
		/*
		 * for(int i=0;i<allStudents.size();i++) {
		 * System.out.println(allStudents.get(i).getSid()+"/t"+
		 * allStudents.get(i).getSname()+"/t"+ allStudents.get(i).getSage()+"/t"+
		 * allStudents.get(i).getSaddress()+"/t"+ allStudents.get(i).getScourse()); }
		 */
		return new ModelAndView("AllStudents.jsp").addObject("Students", allStudents);
	}
}
