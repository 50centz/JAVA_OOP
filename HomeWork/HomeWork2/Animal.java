package HomeWork.HomeWork2;

/**
 * Animal
 */
public abstract class Animal {

    private Double growth;
    private Double weight;
    private String eyeColor;

    public Animal(Double growth, Double weight, String eyeColor){
        this.growth = growth;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public String getInfoAnimal(){
        return String.format("growth: %.2f  weight: %.2f  eye color: %s", growth, weight, eyeColor);
    }  
}