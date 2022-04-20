package Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


/**
 * JavaCoreForQA_HomeWork9
 *
 * @autor Roman Ukolov
 * @version 20.04.2022
 *
 */

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Max", Arrays.asList(
                new Course("WEB"),
                new Course("JAVA"),
                new Course("SQL"))));
        students.add(new Student("Bill", Arrays.asList(
                new Course("WEB"),
                new Course("Test"))));
        students.add(new Student("Ilon", Arrays.asList(
                new Course("WEB"),
                new Course("SQL"),
                new Course("SpaceShips"),
                new Course("Media"))));

        System.out.println(students.stream()
                .map(s -> s.getCousres())
                .flatMap(c -> c.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCousres().size() - s1.getCousres().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("WEB");
        System.out.println(students.stream()
                .filter(s -> s.getCousres().contains(course))
                .map(s -> s.getName())
                .collect(Collectors.toList()));
    }
}

