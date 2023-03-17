package Seminars.Seminar5;

import Seminars.Seminar5.presenter.Presenter;
import Seminars.Seminar5.ui.ConsoleUI;
import Seminars.Seminar5.ui.DesktopUI;
import Seminars.Seminar5.ui.View;
import Seminars.Seminar5.weatherApi.Service;
import Seminars.Seminar5.weatherApi.WeatherService;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        Service service = new WeatherService();
        Presenter presenter = new Presenter(view, service);

        view.start();
    } 
}

