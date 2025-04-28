package com.example.scalable_web_app;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User saveUser(User product) {
        return userRepository.save(product);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
