package Lesson1;

import org.jetbrains.annotations.NotNull;

public abstract class Players implements IPlayers {
    private String name;
    private double runSpeed;
    private double swimSpeed;
    private double jumpHeight;

    Players(String name, double runSpeed, double swimSpeed, double jumpHeight) {
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

    public double getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public double swim(Pool pool) {
        //double timeToOvercome = pool.getLength() / swimSpeed;
        //return timeToOvercome;
        return pool.getLength() / swimSpeed;
    }
    public double jump(Wall wall) {
        return  wall.getHeight()/ jumpHeight;
    }

   public double run(Track track) {
       return  track.getLength() / runSpeed;
    }


    @Override
    public String toString() {
        return "Name: " + name + " - swim: " + swimSpeed + " - jump: " + jumpHeight + " - run: " +runSpeed;
    }
}
