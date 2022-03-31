package Lesson3;
/**
 * JavaCoreForQA_HomeWork3
 *
 * @autor Roman Ukolov
 * @version 30.03.2022
 *
 */

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.2f));
        appleBox.addFruit(new Apple(1.2f));
        appleBox.addFruit(new Apple(1.1f));
        //appleBox.addFruit(new Orange(1.5f));
        System.out.println("Apples");
        System.out.println(appleBox);
        System.out.print("Fruits box weight = ");
        System.out.println(appleBox.getWeight());
        System.out.println();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        System.out.println("Oranges");
        System.out.println(orangeBox);
        System.out.print("Fruits box weight = ");
        System.out.println(orangeBox.getWeight());
        System.out.println();

        System.out.print("Compare result = ");
        System.out.println(appleBox.compare(orangeBox));


    }
}
