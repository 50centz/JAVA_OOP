package HomeWork.HomeWork6_version1.presenter;



import HomeWork.HomeWork6_version1.model.Model;
import HomeWork.HomeWork6_version1.view.View;

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

    public StringBuilder readd(){
        StringBuilder str = model.read();
        return str;
    }
}
