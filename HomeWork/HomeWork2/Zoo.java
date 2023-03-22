package HomeWork.HomeWork2;

import java.util.ArrayList;

public class Zoo {

    //private Animal zoo;
    private static ArrayList<Animal> array = new ArrayList<>();

    public void setZoo(Animal animal) {
        array.add(animal);
    }

    public void setDeleteAnimal(int index) {
        array.remove(index);
    }

    public void getAnimal(int index) {
        Animal animal = array.get(index);
        System.out.println(animal.getClass().getSimpleName());
        if (animal instanceof Cat) {
            System.out.println(((Cat) animal).getInfoAnimal());
        }
        if (animal instanceof Chicken) {
            System.out.println(((Chicken) animal).getInfoAnimal());
        }
        if (animal instanceof Dog) {
            System.out.println(((Dog) animal).getInfoAnimal());
        }
        if (animal instanceof Stork) {
            System.out.println(((Stork) animal).getInfoAnimal());
        }
        if (animal instanceof Wolf) {
            System.out.println(((Wolf) animal).getInfoAnimal());
        }
    }

    public void getSound(int index) {
        Animal animal = array.get(index);
        System.out.println(animal.getClass().getSimpleName());
        if (animal instanceof Sound) {
            ((Sound) animal).getSound();
        }
    }

    public void getAllAnimals() {
        for (Animal animal : array) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.getInfoAnimal());
        }
    }

    public void getAllSound() {
        for (Animal animal : array) {
            System.out.println(animal.getClass().getSimpleName());
            if (animal instanceof Sound) {
                ((Sound) animal).getSound();
            }
        }
    }

}
