package HomeWork.HomeWork4;

public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr();
        
        Integer[] arr1 = new Integer[]{10, 20, 3};

        Arr arr2 = new Arr<>(arr1);

        System.out.println(arr2.size());

        System.out.println(arr2.getElement(2));

        
    }
}
