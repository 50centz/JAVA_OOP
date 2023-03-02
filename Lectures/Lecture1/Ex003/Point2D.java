package Lectures.Lecture1.Ex003;
/**
 *  Это точка 2D
 */

public class Point2D {
    private int x, y;
    /**
     * Это конструктор ...
     * @param valueX Это координата X
     * @param valueY Это координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        // this.x = value;
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }
    // public Point2D(){
    //   x = 0;
    //   y = 0;  
    // }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // }

    private String getInfo(){
        return String.format("x: %d; y: %d", x , y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x, 2)+ Math.pow(a.y - b.y, 2));
   }
}
