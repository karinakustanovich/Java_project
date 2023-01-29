package lesson14.animals;

import lesson14.animals.interfases.Breathable;
import lesson14.animals.interfases.IFly;

public class Bird extends Animal implements IFly {
    @Override
    public void howManyLegs() {
        System.out.println("I'm a bird - I have 2 legs");
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird - I'm flying");
    }
}
