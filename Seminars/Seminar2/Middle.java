package Seminars.Seminar2;

public class Middle extends Student implements Play, Smoke{
    @Override
    public void play() {
        System.out.println("Я играю в MineCraft");
    }

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    
    }
}
