package Seminars.Seminar5.weatherApi;

import com.google.gson.Gson;
import Seminars.Seminar5.weatherApi.weather.Weather;

public class Formatter {
    public Weather parse(String info) {
        Gson gson = new Gson();
        Weather weather = gson.fromJson(info, Weather.class);
        return weather;
    }
}
