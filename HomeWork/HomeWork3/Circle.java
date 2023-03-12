package HomeWork.HomeWork3;

public class Circle extends GeometricShapes implements CircumferenceLength, Square{

    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    @Override
    public void getCircumferenceLength() {
        Double length = (radius * 2) * 3.14;
        System.out.printf("  Circumference length: %.2f", length);
    }


    @Override
    public void getSquare() {
        Double square = (radius * radius) * 3.14;
        System.out.printf("Square: %.2f", square);
    } 

    @Override
    public String toString() {
        return String.format("Circle radius: %.2f", radius);
    }

    @Override
    public Double getSortSquare() {
        Double result = (radius * radius) * 3.14;
        return result;
    }
}
