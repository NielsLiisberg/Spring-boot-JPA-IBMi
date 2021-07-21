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

	@GetMapping("/hello")
	String demo1() {
		return "This is demo 1";
	}

	@GetMapping("/customer/{id}")
	Optional<Customer> getCustomer(@PathVariable("id") Long id) {
		return customerRepository.findById(id);
	}

	@GetMapping("/customerList")
	Iterable<Customer> getCustomerListAll() {
		return  customerRepository.findAll();
	}

	@GetMapping("/customerSearch")
	List<Customer> getCustomerListSearch(@RequestParam("search") String search) {
		return  customerRepository.findBySearch(search );
	}


}