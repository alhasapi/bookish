package com.alhasapi.book.controller;


import com.alhasapi.book.model.User;
import com.alhasapi.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> delete(@PathVariable String username) {
        Optional<?> maybeUser = userService.findByUsername(username);
        if (maybeUser.isPresent())
            return new ResponseEntity<>(maybeUser.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
