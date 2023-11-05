package com.kadai9.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") int id) {
        try {
            return userService.findUser(id);
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
