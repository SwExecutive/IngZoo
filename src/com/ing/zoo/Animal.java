package com.ing.zoo;

abstract class Animal {
    String name;
    public String helloText;
    public String eatText;
    public String animalSpecies;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
