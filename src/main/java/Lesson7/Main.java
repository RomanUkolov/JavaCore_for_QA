package Lesson7;
/**
 * JavaCoreForQA_HomeWork4
 *
 * @autor Roman Ukolov
 * @version 11.04.2022
 *
 */
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AccuweatherModel accuweatherModel = new AccuweatherModel();
        accuweatherModel.getWeather("Moscow", Period.FIVE_DAYS);


    }
}
