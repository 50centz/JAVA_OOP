package HomeWork.HomeWork1;

public class FoodProducts extends Products {

    private String expirationDate;

    public FoodProducts(String name, Double price, int count, String unitOfMeasurement, String expirationDate){
        super(name, price, count, unitOfMeasurement);
        this.expirationDate = expirationDate;
    }

    
    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("Expiration date: %s", expirationDate);
        return result;
    }
}
