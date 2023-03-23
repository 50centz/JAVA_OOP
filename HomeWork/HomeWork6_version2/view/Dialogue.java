package HomeWork.HomeWork6_version2.view;

import java.io.IOException;
import java.util.Scanner;

public class Dialogue implements Scan{

    private Scanner scanner;
    private Read read;
    private View view;

    public Dialogue(){
        scanner = new Scanner(System.in);
        read = new Read();
    }

    public void setView(View view){
        this.view = view;
    }

    @Override
    public StringBuilder scan() throws IOException {
        boolean start = true;
        StringBuilder str = new StringBuilder();
        
        while(start){
            System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - View all entries in notepad\n3 - Exit");
            int choice = scanner.nextInt();
            if (choice == 1){
                str = read.read();
                view.startPresenter(str);
            }
            if (choice == 2){
                StringBuilder str2 = view.test4();
                System.out.println(str2.toString());
            }
            if (choice == 3){
                start = false;
            }
            continue;
        }
        return null;
    }
}
