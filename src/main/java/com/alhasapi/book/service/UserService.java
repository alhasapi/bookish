package com.alhasapi.book.service;


import com.alhasapi.book.model.Role;
import com.alhasapi.book.model.User;
import com.alhasapi.book.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements  IUserService {
   @Autowired
   private IUserRepository userRepository;

   @Autowired
   private PasswordEncoder passwordEncoder;

   public User saveUser(User user) {
      user.setPassword(passwordEncoder.encode(user.getPassword()));
      user.setRole(Role.USER);
      user.setCreateTime(LocalDateTime.now());

      return userRepository.save(user);
   }

   @Transactional
   @Override
   public Optional<User> findByUsername(String username) {
      return userRepository.findByUsername(username);
   }

   public List<User> findAllUsers() {
      return userRepository.findAll();
   }

   @Transactional
   public void makeAdmin(String username) {
      userRepository.updateUserRole(username, Role.ADMIN);
   }

}
