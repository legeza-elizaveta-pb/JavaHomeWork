package com.pb.legeza.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("23","ger",2.5f);
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone1.setModel("iphone");
        phone1.setNumber("0502046859");
        phone2.setModel("pixel");


        System.out.println(phone1.getInfo());
        System.out.println(phone2.getInfo());
        System.out.println(phone3.getInfo());

        if (phone1.getNumber() != null ) {
            String upperNumber = phone1.getNumber().toUpperCase();
            System.out.println(upperNumber);
        }

        phone1.receiveCall("Иванов");
        phone1.sendMessage("0000000","0569595");

    }
}

