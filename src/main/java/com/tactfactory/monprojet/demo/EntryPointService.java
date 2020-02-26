package com.tactfactory.monprojet.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tactfactory.monprojet.databases.UserRepository;
import com.tactfactory.monprojet.entities.User;

@Component
public class EntryPointService {

  @Autowired
  private UserRepository userRepository;

  @PostConstruct
  public void insertData() {
    User user = new User();
    user.setEmail("email");
    user.setFirstname("firstname");
    user.setLastname("lastname");
    userRepository.save(user);
  }
}
