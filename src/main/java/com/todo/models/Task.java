package com.todo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Task {
  
  @NotNull
  public String name;
  @NotNull
  @Pattern(regexp = "(finished|inProgres|todo)")
  public String status;
}
