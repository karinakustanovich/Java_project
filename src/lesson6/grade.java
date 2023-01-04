package lesson6;

import java.util.Random;

public class grade {
    public static void main(String[] args) {

        Random random = new Random();
        String names[] = {"Ирина", "Роман", "Глеб", "Карина", "Ольга"};
        int grades[] = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);
        }

        int maxGrade = grades[0];
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                index = i;

            }

        }
        System.out.println("The best student is " + names[index] + " with grade " + grades[index] );

    }
}
