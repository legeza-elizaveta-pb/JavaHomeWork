package com.pb.legeza.hw6;


public class VetClinic {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Тима", 4, "корм", "Красноармейск", false, 1);
        animals[1] = new Horse("Молния", 10, "сено", "Днепр", "черный");
        animals[2] = new Cat("Лютик", 1, "рыба", "Киев", true, 2);

        Veterinarian veterinarian = null;
        try {
            Class tempClass = Class.forName(Veterinarian.class.getName());
            veterinarian = (Veterinarian) tempClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("Проверить работу суперкласса");
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

        System.out.print(System.lineSeparator());

        System.out.println("Проверка работы методов подклассов");
        System.out.println( animals[0].getClass() + " \n" + "\n" + " проверяется");
        System.out.println(animals[0]);
        animals[0].sleep();
        animals[0].eat();
        animals[0].makeNoise();

        System.out.print(System.lineSeparator());
        System.out.println( animals[1].getClass() + "\n" + " проверяется");
        System.out.println(animals[1]);
        animals[1].sleep();
        animals[1].eat();
        animals[2].makeNoise();

        System.out.print(System.lineSeparator());
        System.out.println( animals[2].getClass() + "\n" + " проверяется");
        System.out.println(animals[2]);
        animals[2].sleep();
        animals[2].makeNoise();
        animals[2].eat();

        System.out.print(System.lineSeparator());
        System.out.println("*** equals() and hashCode() \n" + "проверяются. ***");
        System.out.println(animals[0].hashCode() == animals[1].hashCode());
        System.out.println(animals[0].equals(animals[1]));

        Dog testDog = new Dog("Тима", 4, "корм", "Красноармейск", false, 1);
        if (animals[0].hashCode() == testDog.hashCode()) {
            if (animals[0].equals(testDog))
                System.out.println(animals[0].getName() + " and " + testDog.getName() + " equals.");
        }
    }
}

