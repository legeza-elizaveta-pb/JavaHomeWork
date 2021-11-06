package com.pb.legeza.hw6;

public class Animal {
    private final String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise(){
        System.out.println(name + "  шумит.");
    }

    public void eat(){
        System.out.println(name + "  ест " + food + ".");
    }

    public void sleep(){
        System.out.println(name + "  спит.");
    }
}
