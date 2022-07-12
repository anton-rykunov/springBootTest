package com.springboot.test.springboottest.repository;

import com.springboot.test.springboottest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
