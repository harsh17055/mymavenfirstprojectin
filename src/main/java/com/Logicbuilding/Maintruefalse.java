package com.Logicbuilding;

import java.util.Scanner;

public class Maintruefalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        Truefalse truefalse = new Truefalse();
        String name = scanner.nextLine();
        truefalse.setName(name);
        truefalse.truefalse();
    }
}
