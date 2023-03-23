package HomeWork.HomeWork6_version1.view;

import java.util.Scanner;

import HomeWork.HomeWork6_version1.presenter.Presenter;

public class View {
    private Presenter presenter;
    private Scanner scanner;
    private Read read;

    public View(){
        scanner = new Scanner(System.in);
        read = new Read();
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void start(){
        scan();
    }

    private void scan(){
        boolean start = true;
        
        while(start){
            System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - View all entries in notepad\n3 - Exit");
            int choice = scanner.nextInt();
            if (choice == 1){
                StringBuilder str = read.read();
                presenter.onStr(str);
            }
            if (choice == 2){
                StringBuilder str2 = presenter.readd();
                System.out.println(str2.toString());
            }
            if (choice == 3){
                start = false;
            }
        }
    }
}
