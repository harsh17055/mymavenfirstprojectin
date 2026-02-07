package com.Swaaping;

import java.util.Scanner;

public class Mainswaap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swaap swaap = new Swaap();
        swaap.swaap(a,b);

    }
}
