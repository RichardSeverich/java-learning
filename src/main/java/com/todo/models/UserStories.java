package com.todo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

public class UserStories {
  
  @NotNull
  public String name;
  @NotNull
  @Pattern(regexp = "(Developer|Tester|Manager)")
  public String status;
  public List <Task> taskList = new ArrayList<>();
}
