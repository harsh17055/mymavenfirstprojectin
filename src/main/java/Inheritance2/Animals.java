package Inheritance2;

public class Animals implements Dog{
    @Override
    public void bark() {
        System.out.println("bark");
    }

    @Override
    public void meow() {
        System.out.println("meow");
    }
}
