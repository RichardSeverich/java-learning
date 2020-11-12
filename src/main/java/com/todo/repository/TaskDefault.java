package com.todo.repository;

import com.todo.models.Task;
import com.todo.models.UserStories;

public class TaskDefault {

  /**Metodo.*/
  public static void register() {

    Task task = new Task();
    task.name = "mostrar usuarios";
    task.status = "finished";
    TaskList.taskArrayList.add(task);
    /*UserStories storie = UserStoriesList.storiesArrayList.get(0);
    storie.taskList.add(task);*/
    UserStoriesList.storiesArrayList.get(0).taskList.add(task);

    Task task1 = new Task();
    task1.name = "Registrar usuarios";
    task1.status = "inProgres";
    TaskList.taskArrayList.add(task1);
    UserStoriesList.storiesArrayList.get(0).taskList.add(task1);

    Task task2 = new Task();
    task2.name = "Eliminar usuarios";
    task2.status = "finished";
    TaskList.taskArrayList.add(task2);
    UserStoriesList.storiesArrayList.get(0).taskList.add(task2);

    Task task3 = new Task();
    task3.name = "Modificar usuarios";
    task3.status = "inProgres";
    TaskList.taskArrayList.add(task3);
    UserStoriesList.storiesArrayList.get(0).taskList.add(task3);

    Task task4 = new Task();
    task4.name = "Mostrar ventas";
    task4.status = "todo";
    TaskList.taskArrayList.add(task4);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task4);

    Task task5 = new Task();
    task5.name = "Registrar ventas";
    task5.status = "inProgres";
    TaskList.taskArrayList.add(task5);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task5);

    Task task6 = new Task();
    task6.name = "Eliminar ventas";
    task6.status = "inProgres";
    TaskList.taskArrayList.add(task6);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task6);

    Task task7 = new Task();
    task7.name = "Modificar ventas";
    task7.status = "finished";
    TaskList.taskArrayList.add(task7);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task7);

    Task task8 = new Task();
    task8.name = "registrar producto";
    task8.status = "inProgres";
    TaskList.taskArrayList.add(task8);

    Task task9 = new Task();
    task9.name = "mostrar producto";
    task9.status = "todo";
    TaskList.taskArrayList.add(task9);

    Task task10 = new Task();
    task10.name = "eliminar producto";
    task10.status = "finished";
    TaskList.taskArrayList.add(task10);

    Task task11 = new Task();
    task11.name = "modificar producto";
    task11.status = "todo";
    TaskList.taskArrayList.add(task11);
  }
}
