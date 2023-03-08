package HomeWork.HomeWork2;

public class Dog extends Pet implements Sound, Train{

    private String availabilityOfTraining;

    public Dog(Double growth, Double weight, String eyeColor, String nickname, String breed, String vaccinations,
            String coatColor, String birth, String availabilityOfTraining) {
        super(growth, weight, eyeColor, nickname, breed, vaccinations, coatColor, birth);
        this.availabilityOfTraining = availabilityOfTraining;
    }

    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String dog = "Dog: ";
        String result = dog + s;
        return result;
    }

    @Override
    public void getSound() {
        System.out.println("Woof woof");
    }

    public void getTraining(){
        System.out.println(this.availabilityOfTraining = availabilityOfTraining);
    }

    @Override
    public void train() {
        System.out.println("I'm training");
    }
    
}
