package com.tecsup.lab03.controller;

public class StudentController {

    public void sayHello() {
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.sayHello();
    }
}
