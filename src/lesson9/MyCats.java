package lesson9;

import java.util.ArrayList;

public class MyCats {
    public static void main(String[] args) {

        ArrayList<Cat> mycats = new ArrayList<>();
        mycats.add(new Cat("Harley Quinn", "Cow", 5));
        mycats.add(new Cat("Selina Kyle", "Black and white with Batman's mask", 2));
        mycats.add(new Cat("Poison Ivy", "Black and white with Batman's mask", 3));
        mycats.add(new Cat("Timber", "Dark chocolate", 2));
        mycats.add(new Cat("Basya", "Forest cat", 15));

        mycats.forEach(cat -> System.out.println(cat.toString()));



    }
}
