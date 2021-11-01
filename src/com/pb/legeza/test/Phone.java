package com.pb.legeza.test;

public class Phone {

    static int serialNumber;

    private String number ;
    private String model ;
    private float weight ;
    private int batteryIndicator ;


    public Phone(String number, String model,float weight){
        this(number, model);
        if (weight >  0)  {
            this.weight=weight;
        }
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
        this.model= "PhoneX";
        this.weight= 5.3f;
        this.number="0000000";
        this.batteryIndicator= 100;
    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()){
            return;
        }
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getBatteryIndicator() {
        return batteryIndicator;
    }

    public void setBatteryIndicator(int batteryIndicator) {
        this.batteryIndicator = batteryIndicator;
    }

    private boolean isCharged() {
        return batteryIndicator> 0 ;
    }


public void receiveCall(String name) {
    System.out.println("Звонит " + name);
}

public void receiveCall(String name , String number) {
        if (isCharged()){
        System.out.println("Звонит " + name + ", с номера :" + number);
        batteryIndicator -= 20;
    } else {
            System.out.println("Телефон разрядился");
        }
    }

    public void sendMessage(String... numbers) {
        if(isCharged()){


        System.out.println("Сщщбщение отправляется на номера: ");
        for (String number: numbers) {
            System.out.println(number);
        }
        System.out.println("Cообщние отправлено ");
    } else {
            System.out.println("Телефон разрядился");
        }
    }

        public void charching() {
            System.out.println("Телефон" + model + " заряжается...");
            this.batteryIndicator = 100 ;
            System.out.println("Телефон" + model + " заряжаен");

        }


    String getInfo() {
        return "[модель : " + model + ", номер : " + number + ", вес : " + weight + ", заряд: " +
                batteryIndicator + " ]";
    }
}
