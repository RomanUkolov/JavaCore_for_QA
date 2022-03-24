package Lesson1;


public class Main {
    public static void main(String[] args) {
        Course c = new Course("Triathlon");
        Team team = new Team( "Wolfs");

        team.infoAboutPlayers();
        System.out.println(team);
        c.infoAboutObstacle();
        System.out.println(c);

    }
}
