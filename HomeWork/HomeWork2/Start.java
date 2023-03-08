package HomeWork.HomeWork2;

import java.util.Scanner;

public class Start {
    public static void start(){
        boolean start = true;
        Scanner in = new Scanner(System.in);
        while(start){
            System.out.println("Select an action: \n1 - Add a new animal\n2 - Remove the animal from the zoo\n" +
            "3 - Print about the animal\n4 - Print out about all the animals in the zoo\n5 - Print animal sound\n" +
            "6 - Print the sounds of all animals" );
            int a = in.nextInt();
            if (a == 1){
                continue;
            }
            if (a == 7){
                start = false;
            }
        }
    }
}
