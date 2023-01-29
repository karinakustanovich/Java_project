package lesson14.ClassTask;

import java.util.ArrayList;
import java.util.List;

public class MyPrints {
    public static void main(String[] args) {
        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Book(56));
        printableList.add(new Book(250));
        printableList.add(new Magazine(350));
        printableList.add(new Magazine(450));

        Printable[] array = new Printable[] {
                new Magazine(590),
                new Book(670)
        };

    for (IPrintable printable : printableList) {
        printable.howManyPages(((Printable)printable).getPages());
        printable.printYourType();
    }

    printableList.forEach(printable -> {
        printable.howManyPages(((Printable)printable).getPages());
        printable.printYourType();
    });

    }
}

