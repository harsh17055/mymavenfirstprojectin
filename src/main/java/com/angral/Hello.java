package com.angral;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.ctions.Execute"/> icon in the gutter.
public class Hello{
    public static void main(String[]args) {
        Student student = new Student();
        student.setName("Harsh Angral");
                student.setAge(21);
        System.out.println(student.getAge());
        System.out.println(student.getName());

    }
}