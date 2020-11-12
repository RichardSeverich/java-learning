package com.todo.repository;

import com.todo.models.Task;
import com.todo.models.UserStories;

public class TaskDefault {

  /**Metodo.*/
  public static void register() {

    //USERS
    Task task = new Task();
    task.name = "mostrar usuarios";
    task.status = "todo";
    TaskList.taskArrayList.add(task);
    /*UserStories storie = UserStoriesList.storiesArrayList.get(0);
    storie.taskList.add(task);*/
    UserStoriesList.storiesArrayList.get(0).taskList.add(task);

    Task task1 = new Task();
    task1.name = "Registrar usuarios";
    task1.status = "todo";
    TaskList.taskArrayList.add(task1);
    UserStoriesList.storiesArrayList.get(0).taskList.add(task1);

    Task task2 = new Task();
    task2.name = "Eliminar usuarios";
    task2.status = "todo";
    TaskList.taskArrayList.add(task2);
    UserStoriesList.storiesArrayList.get(0).taskList.add(task2);

    Task task3 = new Task();
    task3.name = "Modificar usuarios";
    task3.status = "todo";
    TaskList.taskArrayList.add(task3);
    UserStoriesList.storiesArrayList.get(0).taskList.add(task3);

    //SAILS
    Task task4 = new Task();
    task4.name = "Mostrar ventas";
    task4.status = "inProgres";
    TaskList.taskArrayList.add(task4);
    UserStoriesList.storiesArrayList.get(1).taskList.add(task4);

    Task task5 = new Task();
    task5.name = "Registrar ventas";
    task5.status = "inProgres";
    TaskList.taskArrayList.add(task5);
    UserStoriesList.storiesArrayList.get(1).taskList.add(task5);

    Task task6 = new Task();
    task6.name = "Eliminar ventas";
    task6.status = "inProgres";
    TaskList.taskArrayList.add(task6);
    UserStoriesList.storiesArrayList.get(1).taskList.add(task6);

    Task task7 = new Task();
    task7.name = "Modificar ventas";
    task7.status = "inProgres";
    TaskList.taskArrayList.add(task7);
    UserStoriesList.storiesArrayList.get(1).taskList.add(task7);

    //PRODUCT
    Task task8 = new Task();
    task8.name = "registrar producto";
    task8.status = "finished";
    TaskList.taskArrayList.add(task8);
    UserStoriesList.storiesArrayList.get(2).taskList.add(task8);

    Task task9 = new Task();
    task9.name = "mostrar producto";
    task9.status = "finished";
    TaskList.taskArrayList.add(task9);
    UserStoriesList.storiesArrayList.get(2).taskList.add(task9);

    Task task10 = new Task();
    task10.name = "eliminar producto";
    task10.status = "finished";
    TaskList.taskArrayList.add(task10);
    UserStoriesList.storiesArrayList.get(2).taskList.add(task10);

    Task task11 = new Task();
    task11.name = "modificar producto";
    task11.status = "finished";
    TaskList.taskArrayList.add(task11);
    UserStoriesList.storiesArrayList.get(2).taskList.add(task10);

    //ANALISIS
    Task task12 = new Task();
    task12.name = "anadir analisis";
    task12.status = "todo";
    TaskList.taskArrayList.add(task12);
    UserStoriesList.storiesArrayList.get(3).taskList.add(task12);

    Task task13 = new Task();
    task13.name = "modificar analisis";
    task13.status = "todo";
    TaskList.taskArrayList.add(task13);
    UserStoriesList.storiesArrayList.get(3).taskList.add(task13);

    Task task14 = new Task();
    task14.name = "eliminar analisis";
    task14.status = "todo";
    TaskList.taskArrayList.add(task14);
    UserStoriesList.storiesArrayList.get(3).taskList.add(task14);

    Task task15 = new Task();
    task15.name = "mostrar analisis";
    task15.status = "todo";
    TaskList.taskArrayList.add(task15);
    UserStoriesList.storiesArrayList.get(3).taskList.add(task15);

    //REPORTS
    Task task16 = new Task();
    task16.name = "anadir analisis";
    task16.status = "finished";
    TaskList.taskArrayList.add(task16);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task16);

    Task task17 = new Task();
    task17.name = "editar analisis";
    task17.status = "finished";
    TaskList.taskArrayList.add(task17);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task17);

    Task task18 = new Task();
    task18.name = "eliminar analisis";
    task18.status = "finished";
    TaskList.taskArrayList.add(task18);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task18);

    Task task19 = new Task();
    task19.name = "mostrar analisis";
    task19.status = "finished";
    TaskList.taskArrayList.add(task19);
    UserStoriesList.storiesArrayList.get(4).taskList.add(task19);

    //COBROS
    Task task20 = new Task();
    task20.name = "anadir cobro";
    task20.status = "in progress";
    TaskList.taskArrayList.add(task20);
    UserStoriesList.storiesArrayList.get(5).taskList.add(task20);

    Task task21 = new Task();
    task21.name = "editar cobro";
    task21.status = "in progress";
    TaskList.taskArrayList.add(task21);
    UserStoriesList.storiesArrayList.get(5).taskList.add(task21);

    Task task22 = new Task();
    task22.name = "aliminar cobro";
    task22.status = "in progress";
    TaskList.taskArrayList.add(task22);
    UserStoriesList.storiesArrayList.get(5).taskList.add(task22);

    Task task23 = new Task();
    task23.name = "mostrar cobro";
    task23.status = "in progress";
    TaskList.taskArrayList.add(task23);
    UserStoriesList.storiesArrayList.get(5).taskList.add(task23);

    //COMPRAS
    Task task24 = new Task();
    task24.name = "anadir cobro";
    task24.status = "finished";
    TaskList.taskArrayList.add(task24);
    UserStoriesList.storiesArrayList.get(6).taskList.add(task24);

    Task task25 = new Task();
    task25.name = "editar cobro";
    task25.status = "finished";
    TaskList.taskArrayList.add(task25);
    UserStoriesList.storiesArrayList.get(6).taskList.add(task25);

    Task task26 = new Task();
    task26.name = "eliminar cobro";
    task26.status = "finished";
    TaskList.taskArrayList.add(task26);
    UserStoriesList.storiesArrayList.get(6).taskList.add(task26);

    Task task27 = new Task();
    task27.name = "mostrar cobro";
    task27.status = "finished";
    TaskList.taskArrayList.add(task27);
    UserStoriesList.storiesArrayList.get(6).taskList.add(task27);

    //PROCESOS PENALES
    Task task28 = new Task();
    task28.name = "anadir proceso";
    task28.status = "finished";
    TaskList.taskArrayList.add(task28);
    UserStoriesList.storiesArrayList.get(7).taskList.add(task28);

    Task task29 = new Task();
    task29.name = "editar proceso";
    task29.status = "finished";
    TaskList.taskArrayList.add(task29);
    UserStoriesList.storiesArrayList.get(7).taskList.add(task29);

    Task task30 = new Task();
    task30.name = "eliminar proceso";
    task30.status = "finished";
    TaskList.taskArrayList.add(task30);
    UserStoriesList.storiesArrayList.get(7).taskList.add(task30);

    Task task31 = new Task();
    task31.name = "mostrar proceso";
    task31.status = "finished";
    TaskList.taskArrayList.add(task31);
    UserStoriesList.storiesArrayList.get(7).taskList.add(task31);

    //PROCESOS CIVILES
    Task task32 = new Task();
    task32.name = "anadir proceso";
    task32.status = "finished";
    TaskList.taskArrayList.add(task32);
    UserStoriesList.storiesArrayList.get(8).taskList.add(task32);

    Task task33 = new Task();
    task33.name = "editar proceso";
    task33.status = "finished";
    TaskList.taskArrayList.add(task33);
    UserStoriesList.storiesArrayList.get(8).taskList.add(task33);

    Task task34 = new Task();
    task34.name = "eliminar proceso";
    task34.status = "finished";
    TaskList.taskArrayList.add(task34);
    UserStoriesList.storiesArrayList.get(8).taskList.add(task34);

    Task task35 = new Task();
    task35.name = "mostrar proceso";
    task35.status = "finished";
    TaskList.taskArrayList.add(task35);
    UserStoriesList.storiesArrayList.get(8).taskList.add(task35);

    //ARCHIVOS
    Task task36 = new Task();
    task36.name = "anadir archivo";
    task36.status = "in progress";
    TaskList.taskArrayList.add(task36);
    UserStoriesList.storiesArrayList.get(9).taskList.add(task36);

    Task task37 = new Task();
    task37.name = "editar archivo";
    task37.status = "in progress";
    TaskList.taskArrayList.add(task37);
    UserStoriesList.storiesArrayList.get(9).taskList.add(task37);

    Task task38 = new Task();
    task38.name = "eliminar archivo";
    task38.status = "in progress";
    TaskList.taskArrayList.add(task38);
    UserStoriesList.storiesArrayList.get(9).taskList.add(task38);

    Task task39 = new Task();
    task39.name = "mostrar archivo";
    task39.status = "in progress";
    TaskList.taskArrayList.add(task39);
    UserStoriesList.storiesArrayList.get(9).taskList.add(task39);

    //PUERTAS
    Task task40 = new Task();
    task40.name = "anadir puerta";
    task40.status = "in progress";
    TaskList.taskArrayList.add(task40);
    UserStoriesList.storiesArrayList.get(10).taskList.add(task40);

    Task task41 = new Task();
    task41.name = "editar puerta";
    task41.status = "in progress";
    TaskList.taskArrayList.add(task41);
    UserStoriesList.storiesArrayList.get(10).taskList.add(task41);

    Task task42 = new Task();
    task42.name = "eliminar puerta";
    task42.status = "in progress";
    TaskList.taskArrayList.add(task42);
    UserStoriesList.storiesArrayList.get(10).taskList.add(task42);

    Task task43 = new Task();
    task43.name = "mostrar puerta";
    task43.status = "in progress";
    TaskList.taskArrayList.add(task43);
    UserStoriesList.storiesArrayList.get(10).taskList.add(task43);
  }
}
