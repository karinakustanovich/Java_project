package lesson15;

public class UnControlledOutOfBounds {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Starting program...");

        array[56] = 56;

        // The program ends with exception - this part of code will not be executed.
        System.out.println("Finishing program...");
    }
}
