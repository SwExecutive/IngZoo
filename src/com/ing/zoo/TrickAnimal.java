package com.ing.zoo;

public abstract class TrickAnimal extends Animal{
    public String trick;

    public TrickAnimal(String name) {
        super(name);
    }

    public abstract void performTrick();
}
