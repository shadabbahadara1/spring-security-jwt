package com.khan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khan.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
