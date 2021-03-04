package com.src.controller;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Customer;
import com.src.model.UserDetails;
import com.src.service.CustomerService;


@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("/")
	public ModelAndView getMainPage(ModelAndView model) {
		model.setViewName("home");
		return model;
	}
	
	
	@RequestMapping("/login")
	public ModelAndView getLoginPage(ModelAndView model) {
		Customer c = new Customer();
		model.addObject("c", c);
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping("/savelogin")
	public ModelAndView getsavelogin(ModelAndView model) {
		model.setViewName("loginmainhome");
		return model;
	}

	@RequestMapping("/register")
	public ModelAndView getregisterPage(ModelAndView model) {
		Customer c = new Customer();
		model.addObject("c", c);
		model.setViewName("register");
		return model;
	}
	

	
	
	
}