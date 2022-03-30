package Lesson3;

import java.util.ArrayList;

/**
 * JavaCoreForQA_HomeWork3
 *
 * @autor Roman Ukolov
 * @version 30.03.2022
 *
 */

public class Box<F extends Fruit> {
    private ArrayList<F> fruits = new ArrayList<>();
    private int count;
    public Box() {
        count++;
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }
/*
    public float getWeight() {

    }
*/
    @Override
    public String toString() {
        return "In Box: " + "fruits - " + fruits;
    }
}
