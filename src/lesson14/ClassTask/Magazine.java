package lesson14.ClassTask;

public class Magazine extends Printable {

    public Magazine(int pages) {
        super(pages);
    }

    @Override
    public void printYourType() {
        System.out.println("My type is magazine");
    }

    @Override
    public void howManyPages(int pages) {
        System.out.println("I'm a magazine with " + pages + " pages");
    }
}
