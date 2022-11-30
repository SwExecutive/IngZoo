package com.ing.zoo.animals;

import com.ing.zoo.Omnivore;
import com.ing.zoo.TrickAnimal;

import java.util.Random;

public class Pig extends TrickAnimal implements Omnivore {

    public Pig(String name) {
        super(name);
        this.animalSpecies = "pig";

    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.printf("%s the %s %s.\n", this.name, this.animalSpecies, this.trick);
    }
}
