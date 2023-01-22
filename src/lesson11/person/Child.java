package lesson11.person;

public class Child extends Person {

    private String address;
    public Child(String firstName, String lastName, int age, boolean isJewish, String address) {
        super(firstName, lastName, age, isJewish);
        this.address = address;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a child");
    }

    @Override
    public void whatIsYourName() {
        System.out.println("I'm a child, my name is " + getFirstName());
    }
}
