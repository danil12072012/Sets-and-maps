import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        List<Integer> nams = generate(20);
        System.out.println("Сгенерированыечисла: " + nams);
        task1(nams);
        task2(nams);
        List<String> words = new ArrayList<>(List.of("Турка", "курит", "трубку", "курка", "клюёт", "крупку",
                "Не", "кури", "турка", "трубку", "не", "клюй", "курка", "крупку"));

        task3(words);
        task4(words);




    }

    private static void task1(List<Integer> nams) {
        System.out.println("Задача 1");
        for (Integer namber : nams) {
            if (namber % 2 == 1) {
                System.out.print(namber + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

    }
    private static void task2(List<Integer> nams) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(nams);
        for (Integer namber : set) {
            if (namber % 2 == 0) {
                System.out.print(namber + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

    }
    private static void task3(List<String> words) {
        System.out.println("Задача 3");
        System.out.println("Исходный набор слов: " + words);
        System.out.println();

        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

    }
    private static void task4(List<String> words) {
        System.out.println("Задача 4");
        System.out.println("Исходный набор слов: " + words);
        System.out.println();
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
            if (map.get(word) > 1) {

                System.out.println(map.get(word));
            }
        }
        System.out.println("----------------------------------------------------");

    }

    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(10));

        }
        return list;
    }
}