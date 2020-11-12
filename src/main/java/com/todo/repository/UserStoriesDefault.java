package com.todo.repository;

import com.todo.models.UserStories;


public class UserStoriesDefault {

  /**Metodo.*/
  public static void register() {

    UserStories storie = new UserStories();
    storie.name = "Modulo de usuarios";
    storie.status = "todo";
    UserStoriesList.storiesArrayList.add(storie);

    UserStories storie1 = new UserStories();
    storie1.name = "Modulo de reportes";
    storie1.status = "inProgres";
    UserStoriesList.storiesArrayList.add(storie1);

    UserStories storie2 = new UserStories();
    storie2.name = "Modulo de compras";
    storie2.status = "finished";
    UserStoriesList.storiesArrayList.add(storie2);

    UserStories storie3 = new UserStories();
    storie3.name = "Modulo de analisis";
    storie3.status = "inProgres";
    UserStoriesList.storiesArrayList.add(storie3);

    UserStories storie4 = new UserStories();
    storie4.name = "Modulo de ventas";
    storie4.status = "finished";
    UserStoriesList.storiesArrayList.add(storie4);

    UserStories storie5 = new UserStories();
    storie5.name = "Modulo de cobros";
    storie5.status = "finished";
    UserStoriesList.storiesArrayList.add(storie5);

    UserStories storie6 = new UserStories();
    storie6.name = "Modulo de productos";
    storie6.status = "todo";
    UserStoriesList.storiesArrayList.add(storie6);

    UserStories storie7 = new UserStories();
    storie7.name = "Modulo de procesos penales";
    storie7.status = "inProgres";
    UserStoriesList.storiesArrayList.add(storie7);

    UserStories storie8 = new UserStories();
    storie8.name = "Modulo de procesos civiles";
    storie8.status = "todo";
    UserStoriesList.storiesArrayList.add(storie8);

    UserStories storie9 = new UserStories();
    storie9.name = "Modulo de archivos";
    storie9.status = "todo";
    UserStoriesList.storiesArrayList.add(storie9);

    UserStories storie10 = new UserStories();
    storie10.name = "Modulo de puertas";
    storie10.status = "inProgres";
    UserStoriesList.storiesArrayList.add(storie10);
  }
}
