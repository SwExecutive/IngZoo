package com.ing.zoo.animals;

import com.ing.zoo.Omnivore;
import com.ing.zoo.TrickAnimal;

import java.util.Random;

public class Bear extends TrickAnimal implements Omnivore {
    public Bear(String name) {
        super(name);
        this.animalSpecies = "bear";

    }

    public void sayHello()
    {
        helloText = "chomp, bark, grunt";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);
    }

    public void eatLeaves()
    {
        eatText = "what is this? What happened to my berries";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }

    public void eatMeat()
    {
        eatText = "amazing thankyou";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "stands on two feet";
        }
        else
        {
            trick = "starts dancing";
        }
        System.out.printf("%s the %s %s.\n", this.name, this.animalSpecies, this.trick);
    }
}
