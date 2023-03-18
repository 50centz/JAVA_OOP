package HomeWork.HomeWork5.view;

import java.io.IOException;
import java.util.Scanner;

import HomeWork.HomeWork5.presenter.Presenter;

public class View {
    private Presenter presenter;
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }
    

    public void start() throws IOException{
        int choice = scan();
        presenter.onClick(choice);
    }

    private int scan(){
        System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - View all entries in notepad\n3 - Exit");
        int choice = scanner.nextInt();
        return choice;
    }
}
