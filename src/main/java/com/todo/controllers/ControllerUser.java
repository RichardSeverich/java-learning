package com.todo.controllers;

//import com.todo.services.ServiceGet;

import javax.validation.Valid;
import com.todo.repository.UsersList;
import java.util.List;
import com.todo.models.User;

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
public class ControllerUser {

  /*@Autowired
  private ServiceGetUser serviceGet;*/

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/users")
  public ResponseEntity<List> read() {
    return ResponseEntity.status(HttpStatus.OK).body(UsersList.usersArrayList);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/users/{id}")
  public ResponseEntity<User> readById(final @PathVariable Integer id) {
    User user = new User();
    if (id >= UsersList.usersArrayList.size()){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
    }
    user = UsersList.usersArrayList.get(id);
    return ResponseEntity.status(HttpStatus.OK).body(user);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/api/v1/users")
  public ResponseEntity<String> create(final @RequestBody User user) {
    UsersList.usersArrayList.add(user);
    return ResponseEntity.status(HttpStatus.CREATED).body("operation successfully");
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/users/{id}")
  public ResponseEntity<String> edit(final @RequestBody User user, final @PathVariable Integer id) {
    if (id >= UsersList.usersArrayList.size()){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
    }
    UsersList.usersArrayList.set(id, user);
    return ResponseEntity.status(HttpStatus.OK).body("operation successfully");
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/users/{id}")
  public ResponseEntity<String> delete(final @PathVariable int id) {
    if (id >= UsersList.usersArrayList.size()){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
    } 
    UsersList.usersArrayList.remove(id); 
    return ResponseEntity.status(HttpStatus.OK).body("operation successfully");
  }
}
