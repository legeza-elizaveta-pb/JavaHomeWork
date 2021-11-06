package com.pb.legeza.hw6;


public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(animal.getName() + " обычно ест " + animal.getFood() + ".");
        System.out.println(animal.getName() + " \n" + "живет в " + animal.getLocation() + ".");
    }
}
