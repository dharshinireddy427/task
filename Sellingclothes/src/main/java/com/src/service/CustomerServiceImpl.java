package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.CustomerDAO;
import com.src.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		return customerDAO.getAllCustomers();
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer customerId) {
		customerDAO.deleteCustomer(customerId);
	}

	
	@Transactional
	public Customer getCustomer(int customerId) {
		return customerDAO.getCustomer(customerId);
	}

	@Transactional
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public Customer getcustomer(int customerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updatecustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}