package com.greatlearning.mvcassessment.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.mvcassessment.crm.entity.Customer;

@Repository
public class CustomerServiceImpl implements CustomerService {

	private SessionFactory sessionFactory;
	private Session session;

	@Autowired
	CustomerServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException ex) {
			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// get All Customers
		Transaction tx = session.beginTransaction();
		List<Customer> customers = session.createQuery("from Customer").list();
		tx.commit();
		return customers;
	}

	@Override
	@Transactional
	public void addCustomer(Customer theCustomer) {
		// add customer
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(theCustomer);
		tx.commit();
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// Search a customer
		Customer customer = new Customer();
		Transaction tx = session.beginTransaction();
		customer = session.get(Customer.class, theId);
		tx.commit();
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Customer customer = session.get(Customer.class, theId);
		session.delete(customer);
		tx.commit();
	}

}
