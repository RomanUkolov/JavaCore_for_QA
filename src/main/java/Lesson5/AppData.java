package Lesson5;

import java.io.*;

public class AppData {
    private String[] header = {"value1", "value2", "Value3"};
    private int[][] data;

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
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) {
            printWriter.write(String.valueOf(header));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
