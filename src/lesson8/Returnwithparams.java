package lesson8;

public class Returnwithparams {
    public static void main(String[] args) {

        System.out.println(sumNumbers(1,5));

        int c = sumNumbers(4,5);

        int first = 6;
        int second = 8;

        System.out.println(sumNumbers(first, second));
        System.out.println(c);
    }

    public static int sumNumbers(int a, int b) {
        return a + b;

    }
}
