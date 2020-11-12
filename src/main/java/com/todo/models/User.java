package com.todo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {
  
  @NotNull
  public String username;
  @NotNull
  public String password;
  @NotNull
  public String name;
  @NotNull
  public String fatherLastName;
  @NotNull
  public String motherLastName;
  @NotNull
  public String birthDate;
  @NotNull
  public int telephone;
  @NotNull
  public String address;
  @NotNull
  public String email;
  @NotNull
  @Pattern(regexp = "(Developer|Tester|Manager)")
  public String type; 
}
