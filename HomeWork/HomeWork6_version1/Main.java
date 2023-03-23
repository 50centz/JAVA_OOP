package HomeWork.HomeWork6_version1;

import java.io.IOException;

import HomeWork.HomeWork6_version1.model.Model;
import HomeWork.HomeWork6_version1.presenter.Presenter;
import HomeWork.HomeWork6_version1.view.View;

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Presenter presenter = new Presenter(view, model);

        view.start();
    }
    
}
