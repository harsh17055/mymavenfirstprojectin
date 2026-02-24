package com.practiceoops;

public class Cow implements Animal{
    @Override
    public void fourlegs() {
        Animal.super.fourlegs();
    }

    @Override
    public void mamal() {
        System.out.println("cow is mamal");

    }

    @Override
    public void speak() {
        System.out.println("cow can speaK");

    }

    @Override
    public void walk() {
        System.out.println("cow can walk");

    }
}
