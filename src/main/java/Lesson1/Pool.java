package Lesson1;
/**
 * JavaCoreForQA_HomeWork1
 *
 * @autor Roman Ukolov
 * @version 26.03.2022
 *
 */

public class Pool extends Obstacle {
    private double length;
    private String name;

    public Pool(double length) {
        this.length = length;
        this.name = "Pool";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String getResult(IPlayers players) {
        return "  Swim time: " + players.swim(this);
    }

    @Override
    public String toString() {
        return name;
    }

}
