package lesson14.animals.interfases;

public interface Breathable {

    int AMOUNT_OF_OXYGEN = 100;
    default void breathe(int amountOfOxygen) {
        System.out.println("I breathe " + AMOUNT_OF_OXYGEN);
    }
}
