package Lesson1;

public class Pool extends Obstacle {
    private double length;

    public Pool(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimePool(IPlayers swimmer) {
        return swimmer.swim(this);
    }

}
