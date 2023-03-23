package HomeWork.HomeWork6_version2.presenter;

import java.io.IOException;

import HomeWork.HomeWork6_version2.model.Model;
import HomeWork.HomeWork6_version2.view.View;

public class Presenter {
    

    private View view;
    private Model model;

    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
        view.setPresenter(this);
        model.setPresenter(this);
    }

    public void onStr(StringBuilder sb) {
        model.recording(sb);
    }

    public StringBuilder readd() throws IOException{
        StringBuilder str = model.read();
        return str;
    }
}
