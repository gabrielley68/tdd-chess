package com.tactfactory.monprojet.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tactfactory.monprojet")
@EntityScan(basePackages ="com.tactfactory.monprojet")
@ComponentScan(basePackages ="com.tactfactory.monprojet")
public class DemoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

//  @Autowired
//  private UserService service;

  @Override
  public void run(String... args) {
    System.out.println("coucou");
//    User user = new User();
//    user.setEmail("email10");
//    user.setFirstname("firstname");
//    user.setLastname("lastname");
//    service.save(user);
  }
}
