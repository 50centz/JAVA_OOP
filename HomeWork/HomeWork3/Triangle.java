package HomeWork.HomeWork3;

public class Triangle extends GeometricShapes implements Square, Perimeter{

    private Double a, b, c;

    public Triangle(Double a, Double b, Double c){
       this.a = a;
       this.b = b;
       this.c = c;
    }

   

    @Override
    public void getPerimeter() {
        Double perimeter = a + b + c;
        System.out.printf("Perimeter: %.2f  ", perimeter);
    }

    @Override
    public void getSquare() {
        Double perimeter = a + b + c;
        Double p = perimeter / 2;
        Double square = Math.sqrt(p * (p - a) * (p - b) * (p-c));
        System.out.printf("Square: %.2f  ", square);
    }

    @Override
    public String toString() {
        return String.format("Side a: %.2f  Side b: %.2f  Side c: %.2f", a, b, c);
    }

    @Override
    public Double getSortSquare() {
        Double perimeter = a + b + c;
        Double p = perimeter / 2;
        Double square = Math.sqrt(p * (p - a) * (p - b) * (p-c));
        Double result = square;
        return result;
    }
}
