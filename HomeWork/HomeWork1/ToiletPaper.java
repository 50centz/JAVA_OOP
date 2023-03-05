package HomeWork.HomeWork1;

public class ToiletPaper extends HygieneItems{

    private String layers;

    public ToiletPaper(String name, Double price, int count, String unitOfMeasurement, String piecesPerPack, String layers) {
        super(name, price, count, unitOfMeasurement, piecesPerPack);
        this.layers = layers;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String result = s + String.format("layers: %s", layers);
        return result;
    }
    
}
