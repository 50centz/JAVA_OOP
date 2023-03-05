package HomeWork.HomeWork1;

public class ChildrensProducts extends Products {


    private String minimumAge;
    private String hhpoallergenic;


    public ChildrensProducts(String name, Double price, int count, String unitOfMeasurement, String minimumAge, String hhpoallergenic){
        super(name, price, count, unitOfMeasurement);
        this.minimumAge = minimumAge;
        this.hhpoallergenic = hhpoallergenic;  
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("Expiration date: %s  Hhpoallergenic: %s", minimumAge, hhpoallergenic);
        return result;
    }
}
