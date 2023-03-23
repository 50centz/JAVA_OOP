package HomeWork.HomeWork6_version2.view;



import java.io.IOException;

import HomeWork.HomeWork6_version2.presenter.Presenter;

public class View {
    private Presenter presenter;
    private Dialogue dialogue;

    public View(){
        dialogue = new Dialogue();
        dialogue.setView(this);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void start() throws IOException{
        dialogue.scan();
    }

    public void startPresenter(StringBuilder str){
        presenter.onStr(str);
    }

    public StringBuilder test4() throws IOException{
        StringBuilder str2 = presenter.readd();
        return str2;
    }
}
