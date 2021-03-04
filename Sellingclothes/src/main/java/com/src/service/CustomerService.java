package com.src.service;

import java.util.List;

import com.src.model.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer customer);

	public List<Customer> getAllCustomer();

	public void deleteCustomer(Integer customerId);

	public Customer getcustomer(int customerid);

	public Customer updatecustomer(Customer customer);

	Customer getCustomer(int customerId);

	Customer updateCustomer(Customer customer);
}