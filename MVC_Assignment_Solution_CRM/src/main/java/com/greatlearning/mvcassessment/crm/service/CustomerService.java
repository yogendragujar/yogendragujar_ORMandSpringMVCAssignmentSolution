package com.greatlearning.mvcassessment.crm.service;

import java.util.List;

import com.greatlearning.mvcassessment.crm.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void addCustomer(Customer theCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer (int theId);
}
