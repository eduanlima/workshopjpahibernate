package com.limaeduan.workshopjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaeduan.workshopjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
