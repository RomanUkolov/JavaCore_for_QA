package Lesson1;


public class Main {
    public static void main(String[] args) {
        Course c = new Course("Triathlon");
        Team team = new Team( "Wolfs");

        team.infoAboutPlayers();
        System.out.println(team);
        System.out.println();
        System.out.println(c);
        c.infoAboutObstacle();
        c.doIt(team);
        team.showResults(c);


    }
}
