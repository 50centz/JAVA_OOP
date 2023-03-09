package HomeWork.HomeWork2;

import static HomeWork.HomeWork2.AddAnimal.addAnimal;
import static HomeWork.HomeWork2.RemoveAnimals.removeAnimals;

import java.util.Scanner;

public class Start {
    public static void start(){
        boolean start = true;
        Scanner in = new Scanner(System.in);
        while(start){
            System.out.println("Select an action: \n1 - Add a new animal\n2 - Remove the animal from the zoo\n" +
            "3 - Print about the animal\n4 - Print out about all the animals in the zoo\n5 - Print animal sound\n" +
            "6 - Print the sounds of all animals\n7 - Shut down the program" );
            int choice = in.nextInt();
            
            if (choice == 1){
                addAnimal(choice);    
            }
            if (choice == 2){
                removeAnimals();
            }
            if (choice == 7){
                start = false;
            }
            continue;
        }

        in.close();
        
    }



    
}
