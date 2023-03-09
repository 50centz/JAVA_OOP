package HomeWork.HomeWork2;

import java.util.Scanner;

public class AddWolf {
    public static void addWolf(){

        System.out.print("Fill in the specifications\nGrowth: ");
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
        System.out.print("PackLeader: ");
        String packLeader = in.nextLine();
        
        
        Wolf wolf = new Wolf(growth, weight, eyeColor, habitat, dateOfLocation, packLeader);
        Zoo zoo = new Zoo();
        zoo.setZoo(wolf);
        System.out.println("Wolf added");

    }


}
