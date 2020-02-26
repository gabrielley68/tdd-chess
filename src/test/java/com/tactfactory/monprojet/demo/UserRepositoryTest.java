package com.tactfactory.monprojet.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tactfactory.monprojet.databases.UserRepository;
import com.tactfactory.monprojet.entities.User;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class UserRepositoryTest {

  @Autowired
  private UserRepository userRepository;

  @Test
  public void testRepo() {
    User user = new User();
    user.setEmail("email10");
    user.setFirstname("firstname");
    user.setLastname("lastname");
    userRepository.save(user);

    assertEquals(4, userRepository.count());
  }
}
