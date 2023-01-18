package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super("brown", 4, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Moreover, it has 2 wings and can fly.";
    }
}
