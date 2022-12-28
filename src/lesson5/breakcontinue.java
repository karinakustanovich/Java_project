package lesson5;

public class breakcontinue {
    public static void main(String[] args) {

        var a = 0;

        while (a < 20) {
            a++;

            if (a % 5 == 0){
                continue;
            }

            if (a == 17){
                break;
            }
            a++;
        }

        System.out.println(a + " ");

    }
}
