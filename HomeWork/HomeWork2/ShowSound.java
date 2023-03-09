package HomeWork.HomeWork2;

import java.util.Scanner;

public class ShowSound {
    public static void showSound(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int index = in.nextInt();
        Zoo zoo = new Zoo();
        zoo.getSound(index);

    }

    public static void showSoundAll(){

        
        Zoo zoo = new Zoo();
        zoo.getAllSound();

    }
}
