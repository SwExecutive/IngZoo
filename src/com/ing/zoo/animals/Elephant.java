package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;

public class Elephant extends Animal implements Herbivore{

    public Elephant(String name) {
        super(name);
        this.animalSpecies = "elephant";
    }

    public void sayHello() {
        helloText = "stomp, stomp, rumble, hello";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);

    }

    public void eatLeaves() {
        eatText = "seems alright but if prefer hay";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }

}