package com.limaeduan.workshopjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaeduan.workshopjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
