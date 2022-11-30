package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(String name) {
        super(name);
        this.animalSpecies = "lion";
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }
}
