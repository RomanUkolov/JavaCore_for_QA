package Lesson1;

public class Pool extends Obstacle {
    private double length;

    public Pool(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTimePool(IPlayers swimmer) {
        return swimmer.swim(this);
    }
    @Override
    public void doIt(IPlayers player) {
        player.swim(this);
    }
}