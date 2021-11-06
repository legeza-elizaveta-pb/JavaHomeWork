package com.pb.legeza.hw6;


import java.util.Objects;
import java.util.Scanner;

public class Dog extends Animal {
    final int chipNumber;
    private int age;
    private boolean barkLoudly;

    public Dog(String name, int age, String food, String location, boolean barkLoudly, int chipNumber) {
        super(name, food, location);
        this.age = age;
        this.barkLoudly = barkLoudly;
        this.chipNumber = chipNumber;
    }

    @Override
    public void makeNoise() {
        if (!barkLoudly) {
            System.out.println(getName() + " животное не шумит.");
        } else {
            super.makeNoise();
        }
    }

    @Override
    public void eat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getName() + " голодный? Напишите\"T\" or \"F\".");
        String input = scanner.nextLine();

        if (input.equals("T")) {
            System.out.println(getName() + " кормят.");
        } else if (input.equals("F")) {
            System.out.println(getName() + " не ест.");
        } else {
            System.out.println("\n" + "Неверный ответ.");
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = " + getName() +
                ", age = " + age +
                ", barkLoudly = " + barkLoudly +
                ", location = " + getLocation() +
                "}.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return chipNumber == dog.chipNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chipNumber);
    }
}
