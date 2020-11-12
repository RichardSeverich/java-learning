package com.todo.models;

import java.util.ArrayList;
import java.util.List;

public class Project {
  public String name;
  public String status;
  public List <UserStories> storiesList = new ArrayList<>();
}
