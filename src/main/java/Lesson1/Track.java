package Lesson1;

public class Track extends Obstacle {
    private double length;

    public Track(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeTrack(IPlayers runner) {
        return runner.run(this);
    }

}
