package HomeWork.HomeWork3;

import static HomeWork.HomeWork3.AddTriangle.addTriangle;
import static HomeWork.HomeWork3.AddSquare.addSquare;
import static HomeWork.HomeWork3.AddRectangle.addRectangle;
import static HomeWork.HomeWork3.AddCircle.addCircle;

import java.util.Scanner;

public class AddGeometricShape {
    
    public static void addGeometricSshape(int choice){
        System.out.println("What geometric shape do you want to add: \n1 - Triangle\n2 - Square\n" +
        "3 - Rectangle\n4 - Circle\n5 - Exit");
        Scanner in = new Scanner(System.in);
        int choice1 = in.nextInt();
        
        if (choice1 == 1){
            addTriangle();
        }
        if (choice1 == 2){
            addSquare();
        }
        if ( choice1 == 3){
            addRectangle();
        }
        if (choice1 == 4){
            addCircle();
        }
        if (choice1 == 5){
        }
    }
}
