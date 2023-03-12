package HomeWork.HomeWork3;

/**
 * Rectangle
 */
public class Rectangle extends GeometricShapes implements Square, Perimeter {

    private Double a, b;

    public Rectangle(Double a, Double b){
        this.a = a;
        this.b = b;
    }

    

    @Override
    public void getPerimeter() {
        Double perimeter = 2 * (a + b);
        System.out.printf("Perimeter: %.2f  ", perimeter);
    }

    @Override
    public void getSquare() {
        Double square = a * b;
        System.out.printf("Square: %.2f  ", square);
    }

    @Override
    public String toString() {
        return String.format("Side a: %.2f  Side b: %.2f", a, b);
    }

    @Override
    public Double getSortSquare() {
        Double result = a * b;
        return result;
    }   
}