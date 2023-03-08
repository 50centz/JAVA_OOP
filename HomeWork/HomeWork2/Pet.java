package HomeWork.HomeWork2;



public abstract class Pet extends Animal{

    private String nickname;
    private String breed;
    private String vaccinations;
    private String coatColor;
    private String birth;

    public Pet(Double growth, Double weight, String eyeColor, String nickname, String breed, String vaccinations, String coatColor, String birth) {
        super(growth, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birth = birth;
    }

    @Override
    public String getInfoAnimal() {
        String s = super.getInfoAnimal();
        String result = s + String.format("  nickname: %s  breed: %s  vccinations: %s  coat color: %s  birth: %s",
        nickname, breed, vaccinations, coatColor, birth);
        return result;
    }
}
