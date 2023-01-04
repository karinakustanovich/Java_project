package lesson5;

public class average {
    public static void main(String[] args) {

        double summ = 0;
        double result;

        for (int i = 0; i < 101; i++) {
            summ += i;

        }
        result = summ / 100;
        System.out.println("Среднее арифметическое = " + result);
    }
}
