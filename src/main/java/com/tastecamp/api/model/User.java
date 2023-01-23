package com.tastecamp.api.model;

import com.tastecamp.api.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

  public User(UserDto data){
    this.name = data.name();
    this.avatar = data.avatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 30, nullable = false)
  private String name;

  @Column(length = 50, nullable = false)
  private String avatar;


}
