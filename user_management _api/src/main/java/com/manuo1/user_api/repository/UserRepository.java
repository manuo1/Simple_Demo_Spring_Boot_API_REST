package com.manuo1.user_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manuo1.user_api.model.AppUser;

@Repository // (equal to @Component) indicates that the class is a bean, and that its role is to communicate with the database
public interface UserRepository extends CrudRepository<AppUser, Long> {
	
}
