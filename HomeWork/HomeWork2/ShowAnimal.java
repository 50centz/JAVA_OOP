package HomeWork.HomeWork2;

import java.util.Scanner;

public class ShowAnimal {
    
    public static void showAnimal(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int index = in.nextInt();
        Zoo zoo = new Zoo();
        zoo.getAnimal(index);

    }

    public static void showAnimalAll(){

        
        Zoo zoo = new Zoo();
        zoo.getAllAnimals();

    }
}
