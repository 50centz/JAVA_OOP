package HomeWork.HomeWork2;

import java.util.Scanner;

public class AddTiger {

    public static void addTiger(){

        System.out.print("Fill in the specifications\nGrowth: \n");
        Scanner in = new Scanner(System.in);
        Double growth = in.nextDouble();
        System.out.print("Weigt: ");
        Double weight = in.nextDouble();
        System.out.print("Eye color: ");
        String eyeColor = in.nextLine();
        System.out.print("Habitat: ");
        String habitat = in.nextLine();
        System.out.print("Date of location: ");
        String dateOfLocation = in.nextLine();
        
        
        Tiger tiger = new Tiger(growth, weight, eyeColor, habitat, dateOfLocation);
        Zoo zoo = new Zoo();
        zoo.setZoo(tiger);
        System.out.println("Tiger added");

    }
}
