package com.transporeon.demoapplicaiton.repository;

import com.transporeon.demoapplicaiton.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
