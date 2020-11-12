package com.todo.controllers;

//import com.todo.services.ServiceGet;
import com.todo.repository.ProjectList;
import com.todo.models.Project;

import java.util.List;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerProject {


  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/projects")
  public ResponseEntity<List> read() {
    return ResponseEntity.status(HttpStatus.OK).body(ProjectList.projectArrayList);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/projects/{id}")
  public ResponseEntity<Project> readById(final @PathVariable int id) {
    Project project = new Project();
    if (id >= ProjectList.projectArrayList.size()) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(project);
    }
    project = ProjectList.projectArrayList.get(id);
    return ResponseEntity.status(HttpStatus.OK).body(project);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/api/v1/projects")
  public ResponseEntity<String> create(final @RequestBody @Valid Project project ) {
    ProjectList.projectArrayList.add(project);
    return ResponseEntity.status(HttpStatus.OK).body("creation successfully");
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/projects/{id}")
  public ResponseEntity<String> edit(final @RequestBody @Valid Project project, final @PathVariable Integer id) {
    if (id >= ProjectList.projectArrayList.size()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
      }
      ProjectList.projectArrayList.set(id, project);
      return ResponseEntity.status(HttpStatus.OK).body("operation successfully");
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/projects/{id}")
  public ResponseEntity<String> delete(final @PathVariable int id) {
    if (id >= ProjectList.projectArrayList.size()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
    }
    ProjectList.projectArrayList.remove(id);
    return ResponseEntity.status(HttpStatus.OK).body("delete successfully");
  }
}
