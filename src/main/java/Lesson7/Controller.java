package Lesson7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private  WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        variants.put(1, Period.NOW);
        variants.put(5, Period.FIVE_DAYS);
        variants.put(2, Period.DB);
    }

    public void getWeather(String userInput, String selectedCity) throws IOException {
        Integer userIntegerInput = Integer.parseInt(userInput);

        switch (variants.get(userIntegerInput)) {
            case NOW:
                weatherModel.getWeather(selectedCity, Period.NOW);
                break;
            case FIVE_DAYS:
                //throw new IOException("Метод не реализован!");
                try {
                    weatherModel.getWeather(selectedCity, Period.FIVE_DAYS);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case DB:
                weatherModel.getSavedToDBWeather();
        }
    }
}



