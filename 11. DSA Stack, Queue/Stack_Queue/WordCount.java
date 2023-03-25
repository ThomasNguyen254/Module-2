package Stack_Queue;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Type somethings here : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        TreeMap<String, Integer> map = new TreeMap<>();

        String[] worlds = input.split("\\s+");
        for(String word : worlds) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }
}
