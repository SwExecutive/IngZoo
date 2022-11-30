package com.ing.zoo;

public abstract class Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String animalSpecies;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
