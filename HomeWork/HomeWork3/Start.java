package HomeWork.HomeWork3;

import static HomeWork.HomeWork3.AddGeometricShape.addGeometricSshape;
import static HomeWork.HomeWork3.DeleteGeometricShape.deleteGeometricShape;
import static HomeWork.HomeWork3.ShowAllInformation.showAllInformation;
import static HomeWork.HomeWork3.AllPerimeters.allPerimeters;
import static HomeWork.HomeWork3.AllArea.allArea;
import static HomeWork.HomeWork3.ChangeShape.changeShape;
import static HomeWork.HomeWork3.CollectionOfFigures.getSortSquare;

import java.util.Scanner;

public class Start {
    public static void start(){
        boolean start = true;
        Scanner in = new Scanner(System.in);
        while(start){
            System.out.println("Select an action: \n1 - Add a geometric shape\n2 - Delete a geometric shape\n" +
            "3 - Show all information on all shapes\n4 - Calculate the perimeter of all shapes\n5 - Calculate the area of all figures\n" +
            "6 - Change the shape\n7 - Sorting by area\n8 - Shut down the program" );
            int choice = in.nextInt();
            
            if (choice == 1){
                addGeometricSshape(choice);    
            }
            if (choice == 2){
                deleteGeometricShape();
            }
            if( choice == 3){
                showAllInformation();
            }
            if (choice == 4){
                allPerimeters();
            }
            if (choice == 5){
                allArea();
            }
            if (choice == 6){
                changeShape();
            }
            if (choice == 7){
                getSortSquare();
            }
            if (choice == 8){
                start = false;
            }
            if (choice > 8){
                continue;
            }
            continue;
        }
        in.close();
    }
}
