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
import java.util.Arrays;

public class AppData {
    private String[] header = {"Value1", "Value2", "Value35"};
    private Integer[][] data = {{50, 74, 30}, {10, 28, 67}, {25, 99, 100}};

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }

    public AppData() {
    }

    public void saveFile(String fileName) {

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

    public void loadFile(String fileName) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split("; ");
            for (int i = 0; i < header.length; i++) {
                System.out.print(header[i] + "; ");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}