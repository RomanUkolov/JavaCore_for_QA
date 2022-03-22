package Lesson1;

public class Wall extends Obstacle{
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

    @Override
    public void doIt(IPlayers player) {
        player.jump(this);
    }
}
