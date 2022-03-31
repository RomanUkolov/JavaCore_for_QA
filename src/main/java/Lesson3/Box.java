package Lesson3;

import java.util.ArrayList;

/**
 * JavaCoreForQA_HomeWork3
 *
 * @autor Roman Ukolov
 * @version 30.03.2022
 *
 */

public class Box<F extends Fruit > {
    private ArrayList<F> fruits = new ArrayList<>();

    public Box() {
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

    public float getWeight() {
        float boxWeight  = 0.0f;
        for (int i = 0; i < fruits.size(); i++) {
             boxWeight = boxWeight + fruits.get(i).getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<?> boxes) {
        return Math.abs(getWeight() - boxes.getWeight()) < 0.1;
    }

    public void changeBox(Box<F> box) {
        for (F fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
    }


    @Override
    public String toString() {
        return "In Box: " + "fruits - " + fruits.size();
    }

}
