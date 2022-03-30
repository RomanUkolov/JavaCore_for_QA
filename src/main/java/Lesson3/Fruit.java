package Lesson3;

import java.util.Objects;

/**
 * JavaCoreForQA_HomeWork3
 *
 * @autor Roman Ukolov
 * @version 30.03.2022
 *
 */

public abstract class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}
