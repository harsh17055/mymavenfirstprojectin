package com.practiceoops;

public interface Animal {
    default void fourlegs() {
        System.out.println("has four legs");
    }
    public void mamal();
    public void speak();
    public void walk();
}
