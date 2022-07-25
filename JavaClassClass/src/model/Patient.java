package model;

import java.security.PublicKey;

public class Patient extends User {
    //Attributes.
    private double weight;
    private double height;
    private String blood;
    public Patient(String name, String email){
        super(name, email);
        this.weight = 54.5;
        System.out.println(weight + "Kg");

    }

    @Override
    public void showDataUser() {
        System.out.println("hola Soy un paciente.");
    }
    //get and set , short cut =  insert + alt


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
