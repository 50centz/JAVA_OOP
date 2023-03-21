package HomeWork.HomeWork6.view;

import java.util.Scanner;

public class Scan {
    public Scan(){

    }

    public int choice(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an item\n1 - Make an entry in a notebook\n2 - View all entries in notepad\n3 - Exit");
        int choice = scanner.nextInt();
        
        return choice;
    }
}
