package HomeWork.HomeWork3;

import java.util.Scanner;

public class AddRectangle {
    
    public static void addRectangle(){

        System.out.print("Enter the sides of the rectangle\nA: ");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        System.out.print("B: ");
        Double b = in.nextDouble();
        
        if(a.equals(b)){
            System.out.println("You cannot create a rectangle with the same sides");
        }else{
            Rectangle rectangle = new Rectangle(a, b);
            CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
            collectionOfFigures.addFigures(rectangle);
            System.out.println("Rectangle added");
            System.out.println();
        }   
    }
}
