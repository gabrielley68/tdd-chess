package com.tactfactory.monprojet.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tactfactory.monprojet.databases.ArticleRepository;
import com.tactfactory.monprojet.databases.RoleRepository;
import com.tactfactory.monprojet.databases.UserRepository;
import com.tactfactory.monprojet.entities.Article;
import com.tactfactory.monprojet.entities.Role;
import com.tactfactory.monprojet.entities.User;

@SpringBootApplication
@EnableJpaRepositories("com.tactfactory.monprojet")
@EntityScan(basePackages ="com.tactfactory.monprojet")
public class DemoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private ArticleRepository articleRepository;

  @Override
  public void run(String... args) {
    User user = new User();
    user.setEmail("email");
    user.setFirstname("firstname");
    user.setLastname("lastname");
    Role role = new Role();
    role.setName("role1");
    roleRepository.save(role);
    user.getRoles().add(roleRepository.findById(role.getId()).get());
    Article article = new Article();
    article.setName("article1");
    article.setPrice(10f);
    articleRepository.save(article);
    user.getArticles().add(articleRepository.findById(article.getId()).get());
    userRepository.save(user);
  }
}
