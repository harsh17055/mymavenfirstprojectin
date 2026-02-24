package com.practiceoops;

public class MainEncap {
    public static void main(String[] args) {
        Encap encap = new Encap();
       encap.setName("Harsh");
        encap.setAge(20);
        System.out.println("name:"+encap.getName());
        System.out.println("age:"+encap.getAge());
    }
}
