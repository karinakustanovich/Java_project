package lesson3;

public class homework3 {
    public static void main(String[] args) {

        int x = 10;
        int y = 12;
        int z = 3;

        x += y - x++ * z;
        System.out.println("x = " + x);

        z = --x - y * 5;
        System.out.println("z = " + z);

        y /= x + 5 % z;
        System.out.println("y = " + y);

        z = x++ + y * 5;
        System.out.println("z = " + z);

        x = y - x++ * z;
        System.out.println("x = " + x);

    }
}
