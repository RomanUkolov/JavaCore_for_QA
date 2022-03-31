package Lesson2;
/**
 * JavaCoreForQA_HomeWork2
 *
 * @autor Roman Ukolov
 * @version 27.03.2022
 *
 */

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2s", "3", "1"},
                {"2", "2", "1", "3"},
                {"1", "2", "2s", "2"},
                {"2", "2", "2", "3"}
        };

        try {
            try {
                int result = Array.arrayMethod(arr);
                System.out.println(result);

            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неверное значение массива");
            System.out.println("Ошибка в ячейке массива: " + e.i + " в ячейке: " + e.j);
        }
    }
}




