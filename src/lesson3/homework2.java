package lesson3;

public class homework2 {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;

        double d1 = 5.5;
        double d2 = 1.3;

        long l = 20l;

        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(result);

        int a = 5;
        int b = 8;

        int resultA = a-- - --a + ++a + a++ + a;
        System.out.println(resultA);
        int resultB = ++b - b++ + ++b - --b;
        System.out.println(resultB);

        






    }
}
