package HomeWork.HomeWork1;

public class Bread extends FoodProducts{

    private String typeFlour;

    public Bread(String name, Double price, int count, String unitOfMeasurement, String expirationDate, String typeFlour) {
        super(name, price, count, unitOfMeasurement, expirationDate);
        this.typeFlour = typeFlour;
    }
    
   @Override
   public String toString() {
        String s = super.toString();
        String result = s + String.format("Type flour: %s", typeFlour);
        return result;
   }
}
