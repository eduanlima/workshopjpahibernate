package com.limaeduan.workshopjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaeduan.workshopjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
