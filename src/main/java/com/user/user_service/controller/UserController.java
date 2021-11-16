package com.user.user_service.controller;

import com.fasterxml.jackson.datatype.jsr310.ser.DurationSerializer;
import com.user.user_service.service.UserService;
import com.user.user_service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/{userId}")
  public User getUser(@PathVariable("userId") Long userId)
  {
      User user=this.userService.getUser(userId);

      //url before changing the configuration for localhost name
      //http://localhost:9002/contact/user/1311/
     // we will directly call it now the contact service cause localhost is not appropriate
     // List contacts=this.restTemplate.getForObject("http://localhost:9002/contact/user/"+userId, List.class);


      List contacts=this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
      user.setContacts(contacts);

 return user;
  }
}
