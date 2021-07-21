package com.example.repositories;

import java.util.List;
import com.example.models.Customer;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> , JpaSpecificationExecutor<Customer> {

	// JPQL - Almost SQL but using the entity models:
	@Query("SELECT c FROM Customer c WHERE upper(lastName) like upper('%' || :lastName || '%') ")
	public List<Customer> findBySearch(String lastName);
}
