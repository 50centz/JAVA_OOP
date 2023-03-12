package HomeWork.HomeWork3;

public class Quadrate extends GeometricShapes implements Square, Perimeter{

    private Double a;

    public Quadrate(Double a){
        this.a = a;
    }

    @Override
    public void getPerimeter() {
        Double perimeter = 4 * a;
        System.out.printf("Perimeter: %.2f  ", perimeter);
    }

    @Override
    public void getSquare() {
        Double square = a * a;
        System.out.printf("Square: %.2f  ", square);
    } 

    @Override
    public String toString() {
        return String.format("Side of the square: %.2f", a);
    }

    @Override
    public Double getSortSquare() {
        Double result = a * a;
        return result;
    } 
}
