package HomeWork.HomeWork7.model;

import HomeWork.HomeWork7.presenter.Presenter;

public class Model {

    private Presenter presenter;
    private Seach seach;

    public Model(){
        seach = new Seach();  
    }

    public String start(String str){
        String result = seach.seachArithmeticSign(str);
        return result; 
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

}
