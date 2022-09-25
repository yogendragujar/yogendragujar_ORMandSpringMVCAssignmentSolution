package com.greatlearning.mvcassessment.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.mvcassessment.crm.entity.Customer;
import com.greatlearning.mvcassessment.crm.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String customerList(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("Customers", theCustomers);
		return "customer-list";
	}

	@RequestMapping("/showForm")
	public String customerForm(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("Customer", theCustomer);
		return "customer-form";
	}

	@RequestMapping("/showFormForAdd")
	public String customerFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("Customer", theCustomer);
		return "customer-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String customerFormForUpdate(@RequestParam("id") int theId, Model theModel) {
		Customer theCustomer = customerService.getCustomer(theId);
		theModel.addAttribute("Customer", theCustomer);
		return "customer-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("email") String email) {
		Customer theCustomer = new Customer();
		if (id != 0) {
			theCustomer = customerService.getCustomer(id);
			System.out.println(id);
			System.out.println(firstName);
			theCustomer.setFirstName(firstName);
			theCustomer.setLastName(lastName);
			theCustomer.setEmail(email);
		} else {
			theCustomer = new Customer(firstName, lastName, email);
		}

		customerService.addCustomer(theCustomer);
		return "redirect:/customer/list";

	}

	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
}
