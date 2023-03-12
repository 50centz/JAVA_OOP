package HomeWork.HomeWork3;

import java.util.Scanner;

public class AddSquare {
    public static void addSquare(){

        System.out.print("Enter the size of the square\n");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        
        Quadrate quadrate = new Quadrate(a);
        CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
        collectionOfFigures.addFigures(quadrate);
        System.out.println("Square added");
        System.out.println();
    }
}
