package HomeWork.HomeWork7.view;

import java.util.Scanner;

import HomeWork.HomeWork7.presenter.Presenter;

public class View {
    private Presenter presenter;
    // private Scanner scanner;
    // private Read read;
    private Test2 test2;

    public View(){
        // scanner = new Scanner(System.in);
        // read = new Read();
        test2 = new Test2();
        test2.setView(this);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void start(){
        StringBuilder str = test2.scan();
        presenter.onStr(str);
    }

    // public void test3(StringBuilder str){
    //     presenter.onStr(str);
    // }

    public StringBuilder test4(){
        StringBuilder str2 = presenter.readd();
        return str2;
    }

    // private void scan(){
    //     boolean start = true;
        
    //     while(start){
    //         System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - View all entries in notepad\n3 - Exit");
    //         int choice = scanner.nextInt();
    //         if (choice == 1){
    //             StringBuilder str = read.read();
    //             presenter.onStr(str);
    //         }
    //         if (choice == 2){
    //             StringBuilder str2 = presenter.readd();
    //             System.out.println(str2.toString());
    //         }
    //         if (choice == 3){
    //             start = false;
    //         }
    //     }
    // }
}
