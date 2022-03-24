package Lesson1;

import org.jetbrains.annotations.NotNull;

public abstract class Players implements IPlayers {
    private String name;
    private double runSpeed;
    private int swimSpeed;
    private int jumpHeight;

    Players(String name, int runSpeed, int swimSpeed, int jumpHeight) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public double swim(Pool pool) {
        return pool.getLength() / swimSpeed;
    }
    public double jump(Wall wall) {
        return  wall.getHeight() / jumpHeight;
    }

   public double run(Track track) {
       return  track.getTimeTrack() / runSpeed;
    }


    @Override
    public String toString() {
        return name + "swim: " + swimSpeed + "jump: " + jumpHeight + "run: " +runSpeed;
    }
}
