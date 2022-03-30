package Lesson3;
/**
 * JavaCoreForQA_HomeWork3
 *
 * @autor Roman Ukolov
 * @version 30.03.2022
 *
 */

//MAX_FINAL_APPLE = 1.0f; - уточникть как правильно объявить.

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        System.out.println(appleBox.getFruits());
        System.out.println(appleBox);

    }
}
