package HomeWork.HomeWork6.presenter;

import HomeWork.HomeWork6.model.Model;
import HomeWork.HomeWork6.view.View;

public class Presenter {
    private View view;
    private Model model;


    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void onClick(int choice){
        model.choice(choice);
    }
}
