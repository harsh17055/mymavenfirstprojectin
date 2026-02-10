package com.Logicbuilding;

public class Truefalse {
        public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void truefalse() {
        System.out.println(name);
        if ( name.equals("Harsh")) {
            System.out.println("male");
        }else{
            System.out.println("female");
        }

    }


}



