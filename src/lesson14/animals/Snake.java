package lesson14.animals;

import lesson14.animals.interfases.Breathable;

public class Snake extends Animal {
    @Override
    public void howManyLegs() {
        System.out.println("I'm a snake - I have no legs...");
    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("I'm a snake. I breathe " + amountOfOxygen);
    }
}
