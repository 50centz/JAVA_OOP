package Seminars.Seminar1;

public class Vehicle {
    private String color;
    private String model;
    private int wheel;
    private int weight;
    private int speed;

    public Vehicle(String color, String model, int wheel, int weight, int speed){
        this.color = color;
        this.model = model;
        this.wheel = wheel;
        this.weight = weight;
        this.speed = speed;
    }

    public void go(){
        System.out.println("Go");
    }

    public void getProperties(){
        System.out.printf("%d, %d, %d, %d, %d", color, model, wheel, weight ,speed);
    }
    
}
