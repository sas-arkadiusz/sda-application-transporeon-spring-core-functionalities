package com.transporeon.demoapplicaiton;

import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import com.transporeon.demoapplicaiton.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplicaitonApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplicaitonApplication.class, args);
	}

}
