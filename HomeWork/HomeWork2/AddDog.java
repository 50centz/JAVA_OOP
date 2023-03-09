package HomeWork.HomeWork2;

import java.util.Scanner;

public class AddDog {
    public static void addDog(){

    

        System.out.print("Fill in the specifications\nGrowth: ");
        Scanner in = new Scanner(System.in);
        Double growth = in.nextDouble();
        System.out.print("Weigt: ");
        Double weight = in.nextDouble();
        System.out.print("Eye color: ");
        String eyeColor = in.nextLine();
        System.out.print("Nickname: ");
        String nickname = in.nextLine();
        System.out.print("Breed: ");
        String breed = in.nextLine();
        System.out.print("Vaccinations: ");
        String vaccinations = in.nextLine();
        System.out.print("Coat color: ");
        String coatColor = in.nextLine();
        System.out.print("Birth: ");
        String birth = in.nextLine();
        System.out.print("Availability of training: ");
        String availabilityOfTraining = in.nextLine();
        
        Dog dog1 = new Dog(growth, weight, eyeColor, nickname, breed, vaccinations, coatColor, birth,  availabilityOfTraining);
        Zoo zoo = new Zoo();
        zoo.setZoo(dog1);
        System.out.println("Dog added");

    }  
}
