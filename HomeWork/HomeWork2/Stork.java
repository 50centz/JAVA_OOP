package HomeWork.HomeWork2;

public class Stork extends Bird implements Sound, FlightAltitude {

    private String flightAltitude;

    public Stork(Double growth, Double weight, String eyeColor, String flightAltitude) {
        super(growth, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    @Override
    public void getFlightAltitude() {
        System.out.printf("I'm flying at %s meters", flightAltitude);
    }

    @Override
    public void getSound() {
        System.out.println("I'm a stork");
    }

    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String stork = "Stork: ";
        String result = stork + s + String.format("  flight a ltitude: %s", flightAltitude);
        return result;
    }

}
