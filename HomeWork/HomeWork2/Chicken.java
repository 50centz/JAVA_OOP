package HomeWork.HomeWork2;

public class Chicken extends Bird implements Sound{

    public Chicken(Double growth, Double weight, String eyeColor) {
        super(growth, weight, eyeColor);
    }

    @Override
    public void getSound() {
        System.out.println("Koo ka re koo");
    }
    
    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String chicken = "Chicken: ";
        String result = chicken + s;
        return result;
    }
}
