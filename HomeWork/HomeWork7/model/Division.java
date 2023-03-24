package HomeWork.HomeWork7.model;

public class Division {
    public String div(String str) {
        String[] result = str.split("[/]");
        Double a = Double.parseDouble(result[0]);
        Double b = Double.parseDouble(result[1]);
        Double res = a / b;
        String answer = Double.toString(res);
        return answer;  
    } 
}
