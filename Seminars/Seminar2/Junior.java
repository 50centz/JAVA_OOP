package Seminars.Seminar2;

public class Junior extends Student implements Play, Go{

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }

    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }

    @Override
    public void goExtension(){
        System.out.println("Я хожу на продленку");
    }
    
}
