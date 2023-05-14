package com.linkedin.springbootblog.repositories;

import com.linkedin.springbootblog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //write custom methods
    User findByEmail(String email);
}
