package Lesson1;

public class Wall extends Obstacle{
    private double height;

    public Wall(int height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getTimeWall(IPlayers jumper) {
        return jumper.jump(this);
    }


}
