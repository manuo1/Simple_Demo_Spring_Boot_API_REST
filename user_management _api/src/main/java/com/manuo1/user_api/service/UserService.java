package com.manuo1.user_api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuo1.user_api.model.AppUser;
import com.manuo1.user_api.repository.UserRepository;

import lombok.Data;

@Data
@Service  // (equal to @Component) indicates that the class is a bean, and that its role is to communicate with the database
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<AppUser> getUserById(final Long id) {
        return userRepository.findById(id);
    }

    public Iterable<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final Long id) {
    	userRepository.deleteById(id);
    }

    public AppUser saveUser(AppUser employee) {
    	AppUser savedUser = userRepository.save(employee);
        return savedUser;
    }

	
}
