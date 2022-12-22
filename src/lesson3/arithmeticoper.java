package lesson3;

public class arithmeticoper {

    public static void main(String[] args) {

        int a = 20;
        int b = 7;

        double c = 20;
        double d = 7;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double result = (c / d);
        System.out.println("c /d = " + result);
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        int resultofint = a / b;
//        int resultofint = a * c; <- not valid operation
        double resultofintdouble = a / d;
        System.out.println("resultofintdouble = " + resultofintdouble);

//        System.out.println("a / 0 = " +(a / 0));
//        System.out.println("c / 0 = " + (c / 0));
    }
}
