package HomeWork.HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import static HomeWork.HomeWork3.ShowAllInformation.showAllInformation;

public class CollectionOfFigures {
    
    private static ArrayList<GeometricShapes> array = new ArrayList<>();


    public void addFigures(GeometricShapes geometricShapes) {
        array.add(geometricShapes);
    }

    public void removeFigures(int index) {
        if (array.size() <= 0){
            System.out.println("There are no figures in the collection");
        }else{
            array.remove(index);
        }
    }

    public void getPerimeterAll() {
        for (GeometricShapes geometricShapes : array) {
            if (geometricShapes instanceof Perimeter) {
                System.out.println(geometricShapes.getClass().getSimpleName());
                ((Perimeter) geometricShapes).getPerimeter();
                System.out.println();
            }
        }
    }

    public void getSquareAll() {
        for (GeometricShapes geometricShapes : array) {
            System.out.println(geometricShapes.getClass().getSimpleName());
            if (geometricShapes instanceof Square) {
                ((Square) geometricShapes).getSquare();
                System.out.println();
            }
        }
    }

    public void getInfoAll(){
        if (array.size() <= 0){
            System.out.println("There are no figures in the collection");
        }else{

            for (GeometricShapes gS : array) {
                System.out.println(gS.getClass().getSimpleName());
                if (gS instanceof Square){
                    ((Square) gS).getSquare();
                }
                if (gS instanceof Perimeter){
                    ((Perimeter) gS).getPerimeter();
                }
                if (gS instanceof CircumferenceLength){
                    ((CircumferenceLength) gS).getCircumferenceLength();
                }
                System.out.println();
            }
        }
    }

    public static void getAllFigure(){
        int i = 1;
        for (GeometricShapes gS : array) {
            System.out.println(gS.getClass().getSimpleName());
            System.out.println(i + " " + gS);
            System.out.println(" ");
            i++;
        }
    }

    public static GeometricShapes getGeometricShapes(int index){
        GeometricShapes geometricShapes = array.get(index);
        return geometricShapes;
    }

    public static void changeFigure(int index){
        int size = array.size();
        int size1 = size - 1;
        Collections.swap(array, index, size1);
        array.remove(size1);

    }

    public static int getSize(){
        return array.size();
    }

    public static void getSortSquare(){

        Collections.sort(array, new SortSquare());
        showAllInformation();
        
    }
}
