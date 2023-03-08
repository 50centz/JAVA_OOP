package HomeWork.HomeWork2;

public class Wolf extends WildAnimal implements Sound{

    private String packLeader;

    public Wolf(Double growth, Double weight, String eyeColor, String habitat, String dateOfLocation, String packLeader) {
        super(growth, weight, eyeColor, habitat, dateOfLocation);
        this.packLeader = packLeader;
    }

    @Override
    public void getSound() {
        System.out.println("yyyyy");
    }
    

    public void getPackLeader(){
        System.out.println(this.packLeader = packLeader);
    }

    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String wolf = "Wolf: ";
        String result = wolf + s;
        return result;
    }
}
