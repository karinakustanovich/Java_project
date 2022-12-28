package lesson5;

public class Nextedloops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\ni = " + i);
            for (int j = 0; j < 15; j++) {
                System.out.printf("%4d", j);

            }
            System.out.println();
        }
    }
}
