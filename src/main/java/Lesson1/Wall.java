package Lesson1;

public class Wall {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTimeWall(IPlayers jumper) {
        return jumper.jump(this);
    }
}
