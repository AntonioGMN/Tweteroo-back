package com.tastecamp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.UserDto;
import com.tastecamp.api.model.User;
import com.tastecamp.api.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  private UserRepository repository;

  @GetMapping()
  public String getOk(){
    return "Tudo ok";
  }

  @PostMapping()
  public void create(@RequestBody UserDto body){
    repository.save(new User(body));
  }

}
