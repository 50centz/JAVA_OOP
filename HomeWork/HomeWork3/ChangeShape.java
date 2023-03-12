package HomeWork.HomeWork3;

import static HomeWork.HomeWork3.CollectionOfFigures.getAllFigure;
import static HomeWork.HomeWork3.CollectionOfFigures.getGeometricShapes;
import static HomeWork.HomeWork3.AddTriangle.addTriangle;
import static HomeWork.HomeWork3.CollectionOfFigures.changeFigure;
import static HomeWork.HomeWork3.AddCircle.addCircle;
import static HomeWork.HomeWork3.AddRectangle.addRectangle;
import static HomeWork.HomeWork3.AddSquare.addSquare;
import static HomeWork.HomeWork3.CollectionOfFigures.getSize;

import java.util.Scanner;

public class ChangeShape {
    
    public static void changeShape(){

        System.out.println("What shape do you want to change ?");
        getAllFigure();
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        int size = getSize();
        GeometricShapes geometricShapes = getGeometricShapes(choice - 1);
        if(geometricShapes instanceof Triangle){
            addTriangle();
        }
        if(geometricShapes instanceof Circle){
            addCircle();
        }
        if(geometricShapes instanceof Quadrate){
            addSquare();
        }
        if(geometricShapes instanceof Rectangle){
            addRectangle();
        }
        int newSize = getSize();
        if(size != newSize){
            changeFigure(choice - 1);
        }
    }
}
