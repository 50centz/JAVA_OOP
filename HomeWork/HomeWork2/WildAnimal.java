package HomeWork.HomeWork2;

public abstract class WildAnimal extends Animal {

    private String habitat;
    private String dateOfLocation;

    public WildAnimal(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation) {
        super(growth, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
        
    }
    
    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String result = s + String.format("  habitat: %s  date of location: %s", habitat, dateOfLocation);
        return result;
    }
}
