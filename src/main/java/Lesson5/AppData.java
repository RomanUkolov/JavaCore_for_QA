package Lesson5;
/**
 * JavaCoreForQA_HomeWork4
 *
 * @autor Roman Ukolov
 * @version 31.03.2022
 *
 */

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header = {"Value1", "Value2", "Value3"};
    private int[][] data =  {{50, 74, 30}, {10, 28, 67}, {25, 99, 100}};

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public AppData() {
    }

    public  void saveFile(String fileName) {
        /*
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName)).) {
            printWriter.write(Arrays.toString(header));

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < header.length; i++) {
                bufferedWriter.write(header[i] + "; ");
            }
            bufferedWriter.write("\n");

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    bufferedWriter.write(data[i][j] + "; ");
                }
                    bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
