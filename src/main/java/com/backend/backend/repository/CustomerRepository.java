package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	
	Customer findById(long id);
	

}
