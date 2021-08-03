package com.example.controller;

import java.util.List;
import java.util.Optional;

import com.example.models.Customer;
import com.example.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	// use case: http://localhost:8888/api/hello
	@GetMapping("/hello")
	String demo1() {
		return "Hello world";
	}

	// use case: http://localhost:8888/api/customer/839283
	@GetMapping("/customer/{id}")
	Optional<Customer> getCustomer(@PathVariable("id") Long id) {
		return customerRepository.findById(id);
	}

	// use case: http://localhost:8888/api/customerList
	@GetMapping("/customerList")
	Iterable<Customer> getCustomerListAll() {
		return  customerRepository.findAll();
	}

	// use case: http://localhost:8888/api/customerSearch?search=john
	@GetMapping("/customerSearch")
	List<Customer> getCustomerListSearch(@RequestParam("search") String search) {
		return  customerRepository.findBySearch(search );
	}


}