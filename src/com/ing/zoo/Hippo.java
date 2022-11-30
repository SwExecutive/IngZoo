package com.ing.zoo;

public class Hippo extends Animal implements Herbivore{

    public Hippo(String name) {
        super(name);
        this.animalSpecies = "hippo";
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);

    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }
}
