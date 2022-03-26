package Lesson1;

public class Course {
    private String nameCourse;
    private Obstacle[] obstacle = new Obstacle[3];

    Course(String nameCourse) {
        this.nameCourse = nameCourse;
        obstacle[0] = new Pool(25.0);
        obstacle[1] = new Track(100.0);
        obstacle[2] = new Wall(5.0);
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Obstacle[] getObstacle() {
        return obstacle;
    }

    public void  infoAboutObstacle() {
        for (Obstacle obs : obstacle) {
            System.out.println("-> " + obs);
        }
    }

    public void doIt(Team team) {
        IPlayers[] teamPlayers = team.getTeamPlayers();
        for (IPlayers p : teamPlayers) {
                p.run((Track) obstacle[1]);
                p.jump((Wall) obstacle[2]);
                p.swim((Pool) obstacle[0]);
            }
        }


    @Override
    public String toString() {
        return nameCourse + " includes: ";
    }
}
