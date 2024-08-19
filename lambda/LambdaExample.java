package lambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        fruits.forEach(fruit -> System.out.println(fruit));

        Collections.sort(fruits, (a, b) -> a.compareTo(b));
        System.out.println("\nSorted List:");
        fruits.forEach(fruit -> System.out.println(fruit));

        fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .forEach(fruit -> System.out.println(fruit));
    }
}
