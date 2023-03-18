package HomeWork.HomeWork5.presenter;

import java.io.IOException;

import HomeWork.HomeWork5.model.Model;
import HomeWork.HomeWork5.view.View;

public class Presenter {
    
    private View view;
    private Model model;

    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }

    public void onClick(int choice) throws IOException{

        model.choice(choice);
    }

    public void back() throws IOException{
        view.start();
    }
}
