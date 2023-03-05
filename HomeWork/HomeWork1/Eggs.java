package HomeWork.HomeWork1;

public class Eggs extends FoodProducts{


    private String quantityPackage;

    public Eggs(String name, Double price, int count, String unitOfMeasurement, String expirationDate, String quantityPackage) {
        super(name, price, count, unitOfMeasurement, expirationDate);
        this.quantityPackage = quantityPackage;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("Quantity package: %s", quantityPackage);
        return result;
    }
}
