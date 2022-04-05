package Lesson5;

import java.util.Arrays;

/**
 * JavaCoreForQA_HomeWork4
 *
 * @autor Roman Ukolov
 * @version 31.03.2022
 *
 * 1. Реализовать сохранение данных в csv файл
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком
 *
 *  Структура csv файла:
 * | Строка заголовок с набором столбцов |
 * | Набор строк с целочисленными значениями |
 * | * Разделитель между столбцами - символ точка с запятой (;) |
 */

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.saveFile("test.cvs");
        appData.loadFile("test.cvs");




    }
}
