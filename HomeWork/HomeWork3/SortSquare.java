package HomeWork.HomeWork3;

import java.util.Comparator;

public class SortSquare implements Comparator<GeometricShapes>{

    @Override
    public int compare(GeometricShapes figure1, GeometricShapes figure2) {
        if (figure1.getSortSquare() < figure2.getSortSquare()){
            return -1;
        }
        if (figure1.getSortSquare() == figure2.getSortSquare()){
            return 0;
        }
        return 1;
    }
    
}
