package com.example.mongo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(path = "")
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}
