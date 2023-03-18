package HomeWork.HomeWork5;

import HomeWork.HomeWork5.model.Model;
import HomeWork.HomeWork5.presenter.Presenter;
import HomeWork.HomeWork5.view.View;

public class Main {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
}
