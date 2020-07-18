package com.tcs.spring.demo.service;


import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.tcs.spring.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	private ArrayList<Customer> customer = new ArrayList<>();
	
	
	public CustomerServiceImpl() {
		
		Customer cust1 = new Customer("121","Safnas",30,"44444444","iamsafnas@gmail.com");
		Customer cust2 = new Customer("122","Aysha",40,"55656566","ffff@ddd.com");
		this.customer.add(cust1);
		this.customer.add(cust2);
	}
	
	

	public Customer getCustomer(String id) {

          Customer cust = null;
          
          for(Customer cust1 : customer) {
        	  if(cust1.getId().equals(id)) {
        		  cust = cust1;
        		  break;
        	  }
          }
		
		return cust;
	}

}
