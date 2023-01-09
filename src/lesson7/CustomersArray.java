package lesson7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CustomersArray {
    public static void main(String[] args) {

        Random random = new Random();
        double myArray[] = new double[10];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;


        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (random.nextDouble());
            System.out.print(myArray[i] + " ");

            if(myArray[i] > max){
                max = myArray[i];
            }

            if (myArray[i] < min){
                min = myArray[i];
            }
            sum += myArray[i];
        }

        for (double number : myArray) {
            if (number % 2 != 0) {
                System.out.println();
            }

        System.out.println("\nmin = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum / myArray.length));
        }

    /*    double myArray2[] = ThreadLocalRandom.current().doubles(10, 0, 100).toArray();
        for (double number : myArray2){
            System.out.println(number);
        }*/
    }
}
