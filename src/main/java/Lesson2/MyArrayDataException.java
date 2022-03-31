package Lesson2;
/**
 * JavaCoreForQA_HomeWork2
 *
 * @autor Roman Ukolov
 * @version 27.03.2022
 *
 */

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

}
