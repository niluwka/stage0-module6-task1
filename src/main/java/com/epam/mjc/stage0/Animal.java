package com.epam.mjc.stage0;

public class Animal {
    public static void main(String[] args) {
Dog dog = new Dog();
Bird bird = new Bird();
dog.getDescription();
bird.getDescription();
    }
    private String color;
    private  int numberOfPaws;
    private boolean  hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;



    }

    public    String  getDescription( ){

        if (numberOfPaws != 1 ) {
            if (hasFur == true) {
                return "This animal is mostly " +    color + ". It has "+ numberOfPaws + " paws and a fur.";
            }else {
                return "This animal is mostly " +    color + ". It has "+ numberOfPaws + " paws and no fur.";
            }

        }else {
            if (hasFur == true){
                return "This animal is mostly " + color + ". It has "+ numberOfPaws + " paw and a fur.";
            }else {
                return "This animal is mostly " +    color + ". It has "+ numberOfPaws + " paw and no fur.";
            }

        }

    }
}