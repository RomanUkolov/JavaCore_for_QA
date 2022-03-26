package Lesson1;

public class Wall extends Obstacle{
    private double height;
    private String name;

    public Wall(double height) {
        this.height = height;
        this.name = "Wall";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String getResult(IPlayers players) {
        return "  Jump time: " + players.jump(this);
    }

    @Override
    public String toString() {
        return name;
    }


}
