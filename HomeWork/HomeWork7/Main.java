package HomeWork.HomeWork7;

import java.io.IOException;

import HomeWork.HomeWork7.model.Model;
import HomeWork.HomeWork7.presenter.Presenter;
import HomeWork.HomeWork7.view.View;

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
    
}
