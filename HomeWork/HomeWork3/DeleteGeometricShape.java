package HomeWork.HomeWork3;

import static HomeWork.HomeWork3.CollectionOfFigures.getAllFigure;

import java.util.Scanner;

public class DeleteGeometricShape {
    
    public static void deleteGeometricShape(){
        Scanner in = new Scanner(System.in);
        getAllFigure();
        System.out.println("Enter a number");
        int index = in.nextInt();
        CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
        collectionOfFigures.removeFigures(index - 1);
    }
}
