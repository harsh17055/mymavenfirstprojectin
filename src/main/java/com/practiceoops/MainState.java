package com.practiceoops;

public class MainState {
    public static void main(String[] args) {
        State state= new State();
        state.setState("jammu");
        state.setCity("digiana");
        System.out.println("state:"+state.getState());
        System.out.println("city:"+state.getCity());

    }
}
