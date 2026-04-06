package com.example.dvsupportbackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dvsupportbackend.Model.User;
import com.example.dvsupportbackend.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")   // ✅ ADD THIS (fixes CORS)
@RestController
@RequestMapping("/")   // keeping your base path as is
public class UserController {

    @Autowired
    private UserRepository repo;

    // POST - create user
    @PostMapping("user")
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }

    // GET - all users
    @GetMapping("users")
    public List<User> getUsers() {
        return repo.findAll();
    }
}