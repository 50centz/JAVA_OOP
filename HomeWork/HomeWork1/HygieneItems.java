package HomeWork.HomeWork1;

public class HygieneItems extends Products {

    private String piecesPerPack;

    public HygieneItems(String name, Double price, int count, String unitOfMeasurement, String piecesPerPack){
        super(name, price, count, unitOfMeasurement);
        this.piecesPerPack = piecesPerPack;
        
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("Expiration date: %s", piecesPerPack);
        return result;
    }
    
}
