package com.todo.repository;

import com.todo.models.Project;

public class ProjectDefault {

  /**Metodo.*/
  public static void register() {

    Project project = new Project();
    project.name = "Sistema de ventas.";
    project.status = "todo";
    ProjectList.projectArrayList.add(project);

    Project project1 = new Project();
    project1.name = "Sistema de alquileres";
    project1.status = "todo";
    ProjectList.projectArrayList.add(project1);

    Project project2 = new Project();
    project2.name = "Sistema de facturacion";
    project2.status = "todo";
    ProjectList.projectArrayList.add(project2);

    Project project3 = new Project();
    project3.name = "Sistema de abogados";
    project3.status = "todo";
    ProjectList.projectArrayList.add(project3);

    Project project4 = new Project();
    project4.name = "Sistema de colegios";
    project4.status = "finished";
    ProjectList.projectArrayList.add(project4);

    Project project5 = new Project();
    project5.name = "Sistema Bancario";
    project5.status = "finished";
    ProjectList.projectArrayList.add(project5);

    Project project6 = new Project();
    project6.name = "Sistema de productos";
    project6.status = "finished";
    ProjectList.projectArrayList.add(project6);

    Project project7 = new Project();
    project7.name = "Sistema de apuntes";
    project7.status = "finished";
    ProjectList.projectArrayList.add(project7);

    Project project8 = new Project();
    project8.name = "Sistema de facebook";
    project8.status = "inProgres";
    ProjectList.projectArrayList.add(project8);

    Project project9 = new Project();
    project9.name = "Sistema de pasajes";
    project9.status = "inProgres";
    ProjectList.projectArrayList.add(project9);

    Project project10 = new Project();
    project10.name = "Sistema de control aereo";
    project10.status = "inProgres";
    ProjectList.projectArrayList.add(project10);
  }
}
