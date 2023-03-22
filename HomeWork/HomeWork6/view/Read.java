package HomeWork.HomeWork6.view;

import java.util.Scanner;

/**
 * Read
 */
public class Read {

    public StringBuilder read(){
        System.out.println("Enter the text: ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        return sb.append(result);
    }
}