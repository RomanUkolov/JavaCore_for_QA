package Lesson3;
/**
 * JavaCoreForQA_HomeWork3
 *
 * @autor Roman Ukolov
 * @version 30.03.2022
 *
 * 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 * 2. Задача:
 * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Класс Box, в который можно складывать фрукты.
 * Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество;
 * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
 * true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.2f));
        appleBox.addFruit(new Apple(1.2f));
        appleBox.addFruit(new Apple(1.3f));
        //appleBox.addFruit(new Orange(1.5f));
        System.out.println("Apples");
        System.out.println(appleBox);
        System.out.print("Fruits box weight = ");
        System.out.println(appleBox.getWeight());
        System.out.println();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.3f));
        System.out.println("Oranges");
        System.out.println(orangeBox);
        System.out.print("Fruits box weight = ");
        System.out.println(orangeBox.getWeight());
        System.out.println();

        Box<Apple> appleBox2 = new Box<>();

        System.out.println("Apples 2 ");
        System.out.println(appleBox2);
        System.out.print("Fruits box weight = ");
        System.out.println(appleBox2.getWeight());
        System.out.println();

        System.out.print("Compare result = ");
        System.out.println(appleBox.compare(orangeBox));
        System.out.println();
        appleBox.changeBox(appleBox2);
        System.out.println("Apples: " + appleBox+ "; weight -  " + appleBox.getWeight());
        System.out.println("Apples 2: " + appleBox2 + "; weight -  " + appleBox2.getWeight());

    }

    public static void swap(Object[] arr, int num1, int num2) {
        Object buf = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = buf;
    }
}
