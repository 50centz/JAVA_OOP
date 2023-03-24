package HomeWork.HomeWork7;

import HomeWork.HomeWork7.model.Model;
import HomeWork.HomeWork7.presenter.Presenter;
import HomeWork.HomeWork7.ui.ConsoleUi;
import HomeWork.HomeWork7.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUi();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
}
