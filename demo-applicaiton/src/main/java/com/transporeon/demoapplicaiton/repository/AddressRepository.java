package com.transporeon.demoapplicaiton.repository;

import com.transporeon.demoapplicaiton.model.entity.customer.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByCityName(String cityName);
}
