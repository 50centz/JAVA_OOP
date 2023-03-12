package HomeWork.HomeWork3;

import java.util.Scanner;

public class AddTriangle {
    
    public static void addTriangle(){

        System.out.print("Enter the length of the sides of the triangle\nA: ");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        System.out.print("B: ");
        Double b = in.nextDouble();
        System.out.print("C: ");
        Double c = in.nextDouble();
        
        if((a + b) > c && (a + c) > b && (b + c) > a){
            Triangle triangle = new Triangle(a, b, c);
            CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
            collectionOfFigures.addFigures(triangle);
            System.out.println("Triangle added");
        }else{
            System.out.printf("It is impossible to construct a triangle with sides %.2f, %.2f and %.2f", a, b, c);
        }
        System.out.println();
    }
}
