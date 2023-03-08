package HomeWork.HomeWork2;

/**
 * Tiger
 */
public class Tiger extends WildAnimal implements Sound{

    public Tiger(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation) {
        super(growth, weight, eyeColor, habitat, dateOfLocation);
    }

    @Override
    public void getSound() {
        System.out.println("rrrrr :):):)");;
    }

    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String tiger = "Tiger: ";
        String result = tiger + s;
        return result;
    }
}