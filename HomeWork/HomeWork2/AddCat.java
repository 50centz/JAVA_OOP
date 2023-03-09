package HomeWork.HomeWork2;

import java.util.Scanner;

public class AddCat {
   
    public static void addCat(){

    

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
        System.out.print("Presence of wool: ");
        String presenceOfWool = in.nextLine();
        
        Cat cat1 = new Cat(growth, weight, eyeColor, nickname, breed, vaccinations, coatColor, birth, presenceOfWool);
        Zoo zoo = new Zoo();
        zoo.setZoo(cat1);
        System.out.println("Cat added");

    }
   

    
}
