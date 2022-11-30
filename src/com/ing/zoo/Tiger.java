package com.ing.zoo;

import java.util.Random;

public class Tiger extends TrickAnimal implements Carnivore{

    public Tiger(String name) {
        super(name);
        this.animalSpecies = "tiger";
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.printf("%s the %s %s.\n", this.name, this.animalSpecies, this.trick);
    }
}
