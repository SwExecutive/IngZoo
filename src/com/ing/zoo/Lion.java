package com.ing.zoo;

public class Lion extends Animal implements Carnivore{
    public Lion(String name) {
        super(name);
        this.animalSpecies = "Lion";
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
