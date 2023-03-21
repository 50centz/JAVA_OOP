package HomeWork.HomeWork6.view;


import HomeWork.HomeWork6.presenter.Presenter;

public class View {

    private Presenter presenter;

    public View(){
        
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void start(){
        Scan scan = new Scan();
        int choice = scan.choice();
         presenter.onClick(choice);
    }

    
    
}
