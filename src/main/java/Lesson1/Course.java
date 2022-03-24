package Lesson1;

public class Course {
    private String nameCourse;
    private Obstacle[] obstacle = new Obstacle[3];

    Course(String nameCourse) {
        this.nameCourse = nameCourse;
        obstacle[0] = new Pool(25);
        obstacle[1] = new Track(100);
        obstacle[2] = new Wall(5);
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void doIt(Team team) {

    }
    void  infoAboutObstacle() {
        for (Obstacle obs : obstacle) {
            System.out.println("includes:" + obs);
        }
    }
    @Override
    public String toString() {
        return nameCourse;
    }
}
