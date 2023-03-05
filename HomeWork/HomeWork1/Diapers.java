package HomeWork.HomeWork1;

public class Diapers extends ChildrensProducts{

    private int size;
    private String minWeight;
    private String maxWeight;
    private String type;

    public Diapers(String name, Double price, int count, String unitOfMeasurement, String minimumAge,
            String hhpoallergenic, int size, String minWeight, String maxWeight, String type) {
        super(name, price, count, unitOfMeasurement, minimumAge, hhpoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
        
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("Size: %d  Min weight: %s  Max weight: %s  Type: %s", size, minWeight, maxWeight, type);
        return result;
    }
 
    
    
    
}
