package com.limaeduan.workshopjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaeduan.workshopjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
