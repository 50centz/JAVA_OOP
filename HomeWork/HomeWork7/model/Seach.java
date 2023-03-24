package HomeWork.HomeWork7.model;

public class Seach{

    private Amount amount;
    private Difference difference;
    private Multiplication multiplication;
    private Division division;

    public Seach(){
        amount = new Amount();
        difference = new Difference();
        multiplication = new Multiplication();
        division = new Division();
    }

    public String seachArithmeticSign(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+'){
                String result = amount.sum(str);
                return result;
            }
            if (str.charAt(i) == '-'){
                String result = difference.minus(str);
                return result;
            }
            if (str.charAt(i) == '*'){
                String result = multiplication.multi(str);
                return result;
            }
            if (str.charAt(i) == '/'){
                String result = division.div(str);
                return result;
            }
        }
        return null;
    }
    
}
