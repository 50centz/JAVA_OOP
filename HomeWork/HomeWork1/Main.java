package HomeWork.HomeWork1;

import static HomeWork.HomeWork1.Program.getProducts;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Products> products = new LinkedHashSet<>();
        
        Milk milk = new Milk("Lianozovo", 100.00, 1, "liters", " one week", "3.2%");
        Lemonade lemonade = new Lemonade("Tarhun", 115.00, 1, "liters", 2.0);
        Bread bread = new Bread("Borodinsky", 45.5, 1, "pieces", " one day", "Wheat flour");
        Eggs eggs = new Eggs("Сhicken", 50.5, 1, "packaging", "two days", "10");
        Masks masks = new Masks("For face", 1000.00, 1, "packaging", "10");
        ToiletPaper toiletPaper = new ToiletPaper("Soft", 100.00, 1, "packaging", "6", "3");
        Diapers diapers = new Diapers("Jhonson", 1150.00, 1, "packaging", 
        "1", "No", 10, "2", "10", "Childish");
        Nipple nipple = new Nipple("Childish", 10.00, 1, "pieces", "1", "No");

        products.add(milk);
        products.add(lemonade);
        products.add(bread);
        products.add(eggs);
        products.add(masks);
        products.add(toiletPaper);
        products.add(diapers);
        products.add(nipple);

        getProducts(products);

    }
}
