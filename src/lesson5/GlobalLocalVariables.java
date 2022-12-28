package lesson5;

public class GlobalLocalVariables {
    public static void main(String[] args) {

        String textoutside = "Outside Loop";
        System.out.println("textoutside = " + textoutside);

        for (int i = 0; i < 1; i++) {
            textoutside = "Now we are inside loop";
            int a = 5;
            System.out.println("a = " + a);

        }

        System.out.println("textoutside = " + textoutside);

        var ab = "Text";


    }
}
