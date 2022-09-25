package com.greatlearning.mvcassessment.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.mvcassessment.crm.entity.Customer;
import com.greatlearning.mvcassessment.crm.service.CustomerService;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String mainPage() {
//		return "main-page";
		return "redirect:/customer/list";
	}

	

	
}
