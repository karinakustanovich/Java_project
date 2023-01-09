package lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countries {
    public static void main(String[] args) {

        HashMap <String, String> hashMap = new HashMap<>();

        hashMap.put("Israel", "Jerusalem");
        hashMap.put("Russian Federation", "Moscow");
        hashMap.put("Republic of Belarus", "Minsk");
        hashMap.put("Ukraine", "Kyiv");
        hashMap.put("Great Britain", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Spain", "Madrid");
        hashMap.put("France", "Paris");
        hashMap.put("Italy", "Rome");
        hashMap.put("Estonia", "Tallinn");

        Set<String> countries = hashMap.keySet();
        System.out.println("Список стран: " + countries);

        hashMap.forEach((country, capital) -> System.out.println(country + " - " + capital));

        System.out.println(hashMap.containsKey("Italy"));
        System.out.println(hashMap.containsKey("New Zealand"));
        System.out.println(hashMap.containsValue("London"));
        System.out.println(hashMap.containsKey("Riga"));









    }
}
