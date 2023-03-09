package HomeWork.HomeWork2;

import java.util.Scanner;

public class RemoveAnimals {

    public static void removeAnimals(){

        Scanner in = new Scanner(System.in);
        System.out.println("");
        int index = in.nextInt();
        Zoo zoo = new Zoo();
        zoo.setDeleteAnimal(index);

    }

    
    
}
