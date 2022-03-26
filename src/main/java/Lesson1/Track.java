package Lesson1;

public class Track extends Obstacle {
    private double length;
    private String name;

    public Track(double length) {
        this.length = length;
        this.name = "Track";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String getResult(IPlayers players) {
        return "   Run time: " + players.run(this);
    }

    @Override
    public String toString() {
        return name;
    }


}
