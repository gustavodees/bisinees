package com.startup.bisiness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.bisiness.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
