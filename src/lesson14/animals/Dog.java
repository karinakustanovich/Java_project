package lesson14.animals;

public class Dog extends Animal implements Runnable{

    @Override
    public void howManyLegs() {
        System.out.println("I'm a dog - I have 4 legs.");
    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("i'm a dog, I breathe " + amountOfOxygen);
    }

    @Override
    public void run() {
        System.out.println("running...");
    }
}
