package com.src.dao;

	import java.util.List;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.src.model.Customer;

	@Repository
	public class CustomerDAOImpl implements CustomerDAO{

		@Autowired
		private SessionFactory sessionFactory;

		public void addCustomer(Customer customer) {
			sessionFactory.getCurrentSession().saveOrUpdate(customer);

		}

		@SuppressWarnings("unchecked")
		

		@Override
		public List<Customer> getAllCustomers() {
			return sessionFactory.getCurrentSession().createQuery("from Customer")
					.list();
		}

		@Override
		public void deleteCustomer(Integer customerId) {
			Customer employee = (Customer) sessionFactory.getCurrentSession().load(
					Customer.class, customerId);
			if (null != employee) {
				this.sessionFactory.getCurrentSession().delete(employee);
			}
		}

		@Override
		public Customer updateCustomer(Customer customer) {
			sessionFactory.getCurrentSession().update(customer);
			return customer;
		}

		@Override
		public Customer getCustomer(int customerid) {
			// TODO Auto-generated method stub
			return null;
		}




	}