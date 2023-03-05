package HomeWork.HomeWork1;

public class Drinks extends Products {

    private Double volume;

    public Drinks(String name, Double price, int count, String unitOfMeasurement, Double volume){
        super(name, price, count, unitOfMeasurement);
        this.volume = volume;
        
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("Expiration date: %.2f", volume);
        return result;
    }
    
}
