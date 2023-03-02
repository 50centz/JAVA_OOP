package Lectures.Lecture1.Ex003;



public class Program {
   
   public static void main(String[] args) {
    Point2D a = new Point2D(0 , 2);
    // a.x = 0;
    // a.y = 2;
    System.out.println(a);



    Point2D b = new Point2D(0);
    // b.setX(0);
    // b.setY(10);
    System.out.println(b.toString());


    var dis = Point2D.distance(a, b);
    System.out.println(dis);
   }
}
