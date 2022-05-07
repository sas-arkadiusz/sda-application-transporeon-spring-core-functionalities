package com.transporeon.demoapplicaiton.repository;

import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
