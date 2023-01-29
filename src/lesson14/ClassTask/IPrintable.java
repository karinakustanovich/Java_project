package lesson14.ClassTask;

public interface IPrintable {

    int PAGES = 500;
    void printYourType();

    default void howManyPages(int pages) {
        System.out.println("By default I have " + PAGES);
    }
}
