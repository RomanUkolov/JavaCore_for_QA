package Lesson4;
/**
 * JavaCoreForQA_HomeWork4
 *
 * @autor Roman Ukolov
 * @version 31.03.2022
 *
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Apple", "Samsung", "Meizu", "Google", "Intel",
                "Intel", "Apple", "Apple", "Huawei", "Google",
                "Intel", "Meizu", "Tesla", "AMD", "Intel"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println(words.toString());
        System.out.println("Сколько раз встречается каждое слово");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Parker", "555-666-555");
        phoneBook.add("Stark", "322-223-322");
        phoneBook.add("Hulk", "777-000-777");
        phoneBook.add("Parker", "897-897-789");

        System.out.println("");
        System.out.println(phoneBook.get("Parker"));
    }
}
