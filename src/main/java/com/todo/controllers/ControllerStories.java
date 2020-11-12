package com.todo.controllers;

//import com.todo.services.ServiceGet;

import javax.validation.Valid;

import com.todo.repository.UserStoriesList;
import java.util.List;
import com.todo.models.UserStories;

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
public class ControllerStories {

  /*@Autowired
  private ServiceGetUser serviceGet;*/

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/stories")
  public ResponseEntity<List> read() {
    return ResponseEntity.status(HttpStatus.OK).body(UserStoriesList.storiesArrayList);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/api/v1/stories{id}")
  public ResponseEntity<UserStories> readById(final @PathVariable int id) {
    UserStories story = new UserStories();
    if (id >= UserStoriesList.storiesArrayList.size()) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(story);
    }
    story = UserStoriesList.storiesArrayList.get(id);
    return ResponseEntity.status(HttpStatus.OK).body(story);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/api/v1/stories")
  public ResponseEntity<String> create(final @RequestBody UserStories storie ) {
    UserStoriesList.storiesArrayList.add(storie);
    return ResponseEntity.status(HttpStatus.OK).body("creation successfully");
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/stories/{id}")
  public ResponseEntity<String> edit(final @RequestBody UserStories storie, final @PathVariable Integer id) {
    if (id >= UserStoriesList.storiesArrayList.size()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
      }
      UserStoriesList.storiesArrayList.set(id, storie);
      return ResponseEntity.status(HttpStatus.OK).body("operation successfully");
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/stories/{id}")
  public ResponseEntity<String> delete(final @PathVariable int id) {
    if (id >= UserStoriesList.storiesArrayList.size()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("operation not completed");
    }
    UserStoriesList.storiesArrayList.remove(id);
    return ResponseEntity.status(HttpStatus.OK).body("delete successfully");
  }
}
