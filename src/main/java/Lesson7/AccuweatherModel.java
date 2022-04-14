package Lesson7;
import com.fasterxml.jackson.databind.JsonNode;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class AccuweatherModel implements WeatherModel {
    //http://dataservice.accuweather.com/forecasts/v1/daily/5day/
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAYS = "5day";
    private static final String API_KEY = "JjXbjKVkpUpgdQAtJtAHFQvlz5GAM6YL";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String API_KEY_LANG_QUERY_PARAM ="language";
    private static final String API_LANGUAGE = "ru-ru";
    private static final String API_KEY_METRIC_QUERY_PARAM = "metric";
    private static final boolean API_METRIC = true;
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                //System.out.println(weatherResponse);

                System.out.println("Погода в " + selectedCity);
                JsonNode oneDayNode = objectMapper.readTree(weatherResponse);
                JsonNode dailyForecastsOneDay = oneDayNode.get("DailyForecasts");
                //String dateDay = dailyForecastsOneDay.get(0).get("Date").asText();
                //System.out.println(dateDay);
                for (int i = 0; i < dailyForecastsOneDay.size(); i++) {
                    //System.out.println(dailyForecastsOneDay.get(i).get("Date").asText());
                    String dateDay = dailyForecastsOneDay.get(i).get("Date").asText();
                    String temperatureUnit =
                            dailyForecastsOneDay.get(i).get("Temperature").get("Minimum").get("Unit").asText();
                    String temperatureMin =
                            dailyForecastsOneDay.get(i).get("Temperature").get("Minimum").get("Value").asText();
                    String temperatureMax =
                            dailyForecastsOneDay.get(i).get("Temperature").get("Maximum").get("Value").asText();
                    String weatherDay =
                            dailyForecastsOneDay.get(i).get("Day").get("IconPhrase").asText();
                    System.out.println("Дата: " + dateDay + " Ожидается: " + weatherDay + " / Мин. " + temperatureMin + " " + temperatureUnit
                            + " / Макс. " + temperatureMax + " " + temperatureUnit);
                }

                break;
            case FIVE_DAYS:
                HttpUrl httpUrl1 = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAYS)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(API_KEY_LANG_QUERY_PARAM, API_LANGUAGE)
                        .addQueryParameter(API_KEY_METRIC_QUERY_PARAM, String.valueOf(API_METRIC))
                        .build();

                Request requestFiveDay = new Request.Builder()
                        .url(httpUrl1)
                        .build();

                Response fiveDayForecastResponse = okHttpClient.newCall(requestFiveDay).execute();
                String weatherResponseFiveDay = fiveDayForecastResponse.body().string();
                //System.out.println(weatherResponseFiveDay);

                System.out.println("Погода в " + selectedCity);
                JsonNode fiveDayNode = objectMapper.readTree(weatherResponseFiveDay);
                JsonNode dailyForecastsFiveDay = fiveDayNode.get("DailyForecasts");
                for (int i = 0; i < dailyForecastsFiveDay.size(); i++) {
                    //System.out.println( "  " + dailyForecastsFiveDay.get(i).get("Date").asText());
                    String date5Day = dailyForecastsFiveDay.get(i).get("Date").asText();
                    String temperatureUnit =
                            dailyForecastsFiveDay.get(i).get("Temperature").get("Minimum").get("Unit").asText();
                    String temperatureMin =
                            dailyForecastsFiveDay.get(i).get("Temperature").get("Minimum").get("Value").asText();
                    String temperatureMax =
                            dailyForecastsFiveDay.get(i).get("Temperature").get("Maximum").get("Value").asText();
                    String weatherDay =
                            dailyForecastsFiveDay.get(i).get("Day").get("IconPhrase").asText();
                    System.out.println("Дата: " + date5Day + " Ожидается: " + weatherDay + " / Мин. " + temperatureMin + " " + temperatureUnit
                            + " / Макс. " + temperatureMax + " " + temperatureUnit);
                }
                //System.out.println();
                break;
        }
    }

    private String detectCityKey(String selectCity) throws IOException {
        //http://dataservice.accuweather.com/locations/v1/cities/autocomplete
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();

        return cityKey;
    }
}
