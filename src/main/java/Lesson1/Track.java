package Lesson1;

public class Track {
    private double length;

    public Track(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTimeTrack(IPlayers runner) {
        return runner.run(this);
    }
}
