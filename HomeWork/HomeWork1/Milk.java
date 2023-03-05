package HomeWork.HomeWork1;

public class Milk extends FoodProducts{

    private String fatContent;

    public Milk(String name, Double price, int count, String unitOfMeasurement, String expirationDate, String fatContent) {
        super(name, price, count, unitOfMeasurement, expirationDate);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("fatContent: %s", fatContent);
        return result;
    }
     
}
