package com.practiceoops;

public class Dog implements Animal{
    @Override
    public void fourlegs() {
        Animal.super.fourlegs();
    }

    @Override
    public void mamal() {
        System.out.println("dog is mamal");

    }

    @Override
    public void speak() {
        System.out.println("dog can speak");

    }

    @Override
    public void walk() {
        System.out.println("dog can walk");

    }
}
