package com.startup.bisiness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.bisiness.entities.OrderItem;
import com.startup.bisiness.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
