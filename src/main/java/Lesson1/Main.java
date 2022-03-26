package Lesson1;
/**
 * JavaCoreForQA_HomeWork1
 *
 * @autor Roman Ukolov
 * @version 26.03.2022
 *
 *  Добавить класс Team, который будет содержать:
 * -название команды;
 * -массив из четырех участников — в конструкторе можно сразу всех участников указывать);
 * -метод для вывода информации о членах команды, прошедших дистанцию;
 * -метод вывода информации обо всех членах команды.
 *
 *  Добавить класс Course (полоса препятствий), в котором будут находиться:
 * -массив препятствий;
 * -метод, который будет просить команду пройти всю полосу.
 *
 */


public class Main {
    public static void main(String[] args) {
        Course c = new Course("Triathlon");
        Team team = new Team( "Wolfs");

        team.infoAboutPlayers();
        System.out.println();
        System.out.println(team);
        System.out.println();
        System.out.println(c);
        c.infoAboutObstacle();
        System.out.println();
        c.doIt(team);
        team.showResults(c);


    }
}
