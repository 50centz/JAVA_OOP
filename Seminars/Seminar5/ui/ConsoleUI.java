package Seminars.Seminar5.ui;

import Seminars.Seminar5.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI  implements View{
    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void start() {
        String city = scan();
        presenter.onClick(city);
    }

    private String scan() {
        System.out.println("Введите город");
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
