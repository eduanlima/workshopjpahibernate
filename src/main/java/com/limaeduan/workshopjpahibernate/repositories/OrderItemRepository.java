package com.limaeduan.workshopjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaeduan.workshopjpahibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
