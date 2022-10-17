package com.alhasapi.book.service;

import com.alhasapi.book.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);

    public void makeAdmin(String username);
}
