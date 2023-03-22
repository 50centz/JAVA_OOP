package HomeWork.HomeWork7.view;

import java.util.Scanner;

public class Test2 implements Test{

    private Scanner scanner;
    private Read read;
    private View view;
    

    public Test2(){
        scanner = new Scanner(System.in);
        read = new Read();
    }

    public void setView(View view){
        this.view = view;
    }

    @Override
    public StringBuilder scan() {
        boolean start = true;
        StringBuilder str = new StringBuilder();
        
        while(start){
            System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - View all entries in notepad\n3 - Exit");
            int choice = scanner.nextInt();
            if (choice == 1){
                str = read.read();
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
        return str;
        
    }
    
}
