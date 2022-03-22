package Lesson1;

public abstract class Players implements IPlayers {
    private String name;
    private double runSpeed;
    private double swimSpeed;
    private double jumpSpeed;

    Players(String name, double runSpeed, double swimSpeed, double jumpSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.jumpSpeed = jumpSpeed;
    }


}
