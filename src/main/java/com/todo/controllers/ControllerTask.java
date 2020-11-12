package com.todo.controllers;

//import com.todo.services.ServiceGet;

import javax.validation.Valid;
import com.todo.repository.TaskList;
import java.util.List;
import com.todo.models.Task;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController.
 */
@RestController
public class ControllerTask {

  /*@Autowired
  private ServiceGetUser serviceGet;*/

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/tasks")
  public ResponseEntity<List> read() {
    return ResponseEntity.status(HttpStatus.OK).body(TaskList.taskArrayList);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/tasks/{id}")
  public ResponseEntity<Task> readById(final @PathVariable Integer id) {
    Task emptytask = new Task();
    if (id >= TaskList.taskArrayList.size()) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(emptytask);
    }
    emptytask = TaskList.taskArrayList.get(id);
    return ResponseEntity.status(HttpStatus.OK).body(emptytask);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/api/v1/tasks")
  public ResponseEntity<String> create(final @RequestBody Task task) {
    TaskList.taskArrayList.add(task);
    return ResponseEntity.status(HttpStatus.OK).body("operation successfully");
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/tasks/{id}")
  public ResponseEntity<String> edit(final @RequestBody Task task, final @PathVariable Integer id) {
    if (id >= TaskList.taskArrayList.size()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
      }
      TaskList.taskArrayList.set(id, task);
      return ResponseEntity.status(HttpStatus.OK).body("operation successfully");
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/tasks/{id}")
  public ResponseEntity<String> delete(final @PathVariable int id) {
    if (id >= TaskList.taskArrayList.size()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
    }
    TaskList.taskArrayList.remove(id);
    return ResponseEntity.status(HttpStatus.OK).body("delete successfully");
  }
}
