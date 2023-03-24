package HomeWork.HomeWork7;

public class Test {
    public static void main(String[] args) {
        String a = "15+15";
        String[] result = a.split("[+-/*]");
        for (String string : result) {
            System.out.println(string);
            Double b = Double.parseDouble(string);
            System.out.println(b.getClass());
        }
        // for (int i = 0; i < a.length(); i++) {
        //     if (a.charAt(i) == '+'){
        //         System.out.println("Yes");
        //     }
        // }    
    }
}
