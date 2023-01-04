package lesson6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class pandomvalues {
    public static void main(String[] args) {

        Random random = new Random();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        int randomInteger = random.nextInt();
        int randomIntegerWithBound = random.nextInt(10);
        double randomDouble = random.nextDouble();

        System.out.println("randomInteger = " + randomInteger);
        System.out.println("randomDouble = " + randomDouble);
        System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);

        int randomIntegerWithBounds = threadLocalRandom.nextInt(-100, 100);
        System.out.println("randomIntegerWithBounds = " + randomIntegerWithBounds);


    }
}
