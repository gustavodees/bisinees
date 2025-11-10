package com.startup.bisiness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.bisiness.entities.Order;
import com.startup.bisiness.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
