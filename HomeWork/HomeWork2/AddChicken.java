package HomeWork.HomeWork2;

import java.util.Scanner;

/**
 * AddChicken
 */
public class AddChicken {

    public static void addChicken(){

    

        System.out.print("Fill in the specifications\nGrowth: ");
        Scanner in = new Scanner(System.in);
        Double growth = in.nextDouble();
        System.out.print("Weigt: ");
        Double weight = in.nextDouble();
        System.out.print("Eye color: ");
        String eyeColor = in.nextLine();
        
        
        Chicken chicken = new Chicken(growth, weight, eyeColor);
        Zoo zoo = new Zoo();
        zoo.setZoo(chicken);
        System.out.println("Chicken added");

    }

    
}
