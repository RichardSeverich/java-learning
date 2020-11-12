package com.todo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Project {
  
  @NotNull
  public String name;
  @NotNull
  @Pattern(regexp = "(finished|inProgres|todo)")
  public String status;
  public List <UserStories> storiesList = new ArrayList<>();
}
