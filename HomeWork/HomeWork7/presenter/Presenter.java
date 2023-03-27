package HomeWork.HomeWork7.presenter;

import HomeWork.HomeWork7.model.Model;
import HomeWork.HomeWork7.ui.DesktopUi;
import HomeWork.HomeWork7.ui.View;

public class Presenter {
    private View view;
    private Model model;
    
    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }

    public String acceptСalculation(String str){
        String result = model.start(str);
        return result;
    }
}
