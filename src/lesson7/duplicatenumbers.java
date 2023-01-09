package lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class duplicatenumbers {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int num;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            num = random.nextInt(50);
            arrayList.add(num);
            hashMap.put(num, 0);
        }

        for (Integer value : arrayList) {
            if (hashMap.containsKey(value))
                hashMap.put(value, hashMap.get(value) + 1);
            else hashMap.put(value, 1);
        }
        System.out.println("Number Repeating Elements");
        hashMap.forEach((n,re) -> System.out.println(n + "      " + re ));
    }
}
