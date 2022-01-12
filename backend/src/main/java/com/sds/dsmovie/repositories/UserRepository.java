package com.sds.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
