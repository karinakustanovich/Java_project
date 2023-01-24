package lesson13.polymorphizm;

import java.util.ArrayList;

public class MyAnimals {
    public static void main(String[] args) {

        Iguana iguana = new Iguana();
        Lizards lizardsIguana = new Iguana();
        Animal animalIguana = new Iguana();

        ArrayList<Iguana> animals = new ArrayList<>();
        animals.add(iguana);
        animals.add((Iguana) lizardsIguana);
        animals.add((Iguana) animalIguana);

        animals.forEach(animal -> animal.hello());




    }
}
