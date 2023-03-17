package HomeWork.HomeWork4;

public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr();
        
        Integer[] arr1 = new Integer[]{10, 20, 10, 1, 21, 99, 55, 1, 3, 45, 99, 2};

        Arr arr2 = new Arr<>(arr1);
        int b = 5;
        arr2.add(b);
        String c = "c";
        arr2.add(c);


        System.out.println(arr2.getSize());

        arr2.bubbleSort();;
        System.out.println();
        arr2.printArr();

        
        

        
    }
}
