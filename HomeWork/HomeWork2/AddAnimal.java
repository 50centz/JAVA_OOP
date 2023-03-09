package HomeWork.HomeWork2;
import static HomeWork.HomeWork2.AddCat.addCat;
import static HomeWork.HomeWork2.AddChicken.addChicken;
import static HomeWork.HomeWork2.AddDog.addDog;
import static HomeWork.HomeWork2.AddStork.addStork;
import static HomeWork.HomeWork2.AddTiger.addTiger;
import static HomeWork.HomeWork2.AddWolf.addWolf;


import java.util.Scanner;

public class AddAnimal {
    
    public static void addAnimal(int choice){
        System.out.println("Choose which animal you want to add: \n1 - Cat\n2 - Chicken\n" +
        "3 - Dog\n4 - Stork\n5 - Tiger\n6 - Wolf");
        Scanner in = new Scanner(System.in);
        int choice1 = in.nextInt();
        
        if (choice1 == 1){
            addCat();
        }
        if (choice1 == 2){
            addChicken();
        }
        if ( choice1 == 3){
            addDog();
        }
        if (choice1 == 4){
            addStork();
        }
        if (choice1 == 5){
            addTiger();
        }
        if (choice1 == 6){
            addWolf();
        }

    }
}
