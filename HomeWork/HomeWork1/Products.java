package HomeWork.HomeWork1;

/**
 * Products
 */
public class Products {

    private String name;
    private Double price;
    private int count;
    private String unitOfMeasurement;

    public Products(String name, Double price, int count, String unitOfMeasurement) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  Price: %.2f  Count: %d  Unit of measurement: %s ", name, price, count, unitOfMeasurement);
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public int getCount(){
        return count;
    }

    public String getUnitOfMeasurement(){
        return unitOfMeasurement;
    }

}