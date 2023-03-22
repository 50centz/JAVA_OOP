package HomeWork.HomeWork6;

import java.io.IOException;

import HomeWork.HomeWork6.model.Model;
import HomeWork.HomeWork6.presenter.Presenter;
import HomeWork.HomeWork6.view.View;

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
    
}
