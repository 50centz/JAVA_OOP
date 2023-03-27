package HomeWork.HomeWork7.ui;

import java.util.Scanner;

import HomeWork.HomeWork7.presenter.Presenter;

public class ConsoleUi implements View, Print{

    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUi(){
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        boolean play = true;
        while(play){
            String string = scan();
            if (string.equals("exit")){
                play = false;
            }else{
                String result = presenter.acceptСalculation(string);
                print(result);
            }
        }
    }

    private String scan() {
        System.out.println("To exit the program, write "+ "\"exit\"" + "\nEnter what to count");
        String result = scanner.nextLine();
        return result;
    }

    @Override
    public void print(String str) {
        if (str == null){
            System.out.println("Incorrect data entered !!!");
        }else{
            System.out.println("Answer: " + str);
        }
    }
}
