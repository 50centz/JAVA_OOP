package HomeWork.HomeWork2;

import java.util.Scanner;

public class AddStork {
    public static void addStork(){

    

        System.out.print("Fill in the specifications\nGrowth: ");
        Scanner in = new Scanner(System.in);
        Double growth = in.nextDouble();
        System.out.print("Weigt: ");
        Double weight = in.nextDouble();
        System.out.print("Eye color: ");
        String eyeColor = in.nextLine();
        System.out.print("Presence of wool: ");
        String presenceOfWool = in.nextLine();
        
        
        Stork stork = new Stork(growth, weight, eyeColor, presenceOfWool);
        Zoo zoo = new Zoo();
        zoo.setZoo(stork);
        System.out.println("Stork added");

    }

   
}
