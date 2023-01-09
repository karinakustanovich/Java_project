package lesson7;

import java.util.ArrayList;

public class customerarraylist {
    public static void main(String[] args) {

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;

        ArrayList<Double> arrayList = new ArrayList<>();
        System.out.println("arrayList.size() = " + arrayList.size());

        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.random() * 10);
            System.out.println(arrayList.get(i) + " ");

        }
        System.out.println("\narraylist.size() = " + arrayList.size());

        for (Double number : arrayList) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            sum += number;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum / arrayList.size()));

        arrayList.forEach(number -> System.out.println(number));
    }
}
