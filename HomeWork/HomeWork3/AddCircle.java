package HomeWork.HomeWork3;

import java.util.Scanner;

public class AddCircle {
    
    public static void addCircle(){

        System.out.print("Enter the radius of the circle\n");
        Scanner in = new Scanner(System.in);
        Double r = in.nextDouble();
        
        Circle circle = new Circle(r);
        CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
        collectionOfFigures.addFigures(circle);
        System.out.println("Circle added");
        System.out.println();
    }
}
