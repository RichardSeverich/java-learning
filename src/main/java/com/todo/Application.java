package com.todo;

import com.todo.models.Project;
import com.todo.models.Task;
import com.todo.repository.ProjectDefault;
import com.todo.repository.TaskDefault;
import com.todo.repository.UserStoriesDefault;
import com.todo.repository.UsersDefault;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

  public static void main(String[] args) {
    ProjectDefault.register();
    UsersDefault.register();
    UserStoriesDefault.register();
    TaskDefault.register();
    SpringApplication.run(Application.class, args);
  }
}
