package HomeWork.HomeWork2;

public class Cat extends Pet implements Sound{

    private String presenceOfWool;
    
    public Cat(Double growth, Double weight, String eyeColor, String nickname, String breed, String vaccinations,
            String coatColor, String birth, String presenceOfWool) {
        super(growth, weight, eyeColor, nickname, breed, vaccinations, coatColor, birth);
        this.presenceOfWool = presenceOfWool; 
    }

    @Override
    public void getSound() {
        System.out.println("Meow meow");
    }

    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String cat = "Cat: ";
        String result = cat + s;
        return result;
    }

    public void getWool(){
        System.out.println(this.presenceOfWool = presenceOfWool);
    }
}
