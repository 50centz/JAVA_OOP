package HomeWork.HomeWork4;

public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr();
        
        Integer[] arr1 = new Integer[]{10, 20, 10, 20, 1, 21, 99, 55, 1};

        Arr arr2 = new Arr<>(arr1);
        // String s = "s";
        // String a = "a";
        // arr2.add(s);

        System.out.println(arr2.getSize());

        arr2.selectSort();
        System.out.println();
        arr2.printArr();

        
        

        
    }
}
