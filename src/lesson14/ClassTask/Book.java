package lesson14.ClassTask;

public class Book extends Printable {


    public Book(int pages) {
        super(pages);
    }

    @Override
    public void printYourType() {
        System.out.println("My type is book");

    }

    @Override
    public void howManyPages(int pages) {
        System.out.println("I'm a book with " + pages + " pages");
    }
}
