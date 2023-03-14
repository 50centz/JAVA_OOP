package Seminars.Seminar4;

public class CatA {
    private String name;
    private int hight;
    
    public String getName() {
        return name;
    }

    public int getHight() {
        return hight;
    }

    public CatA(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }
    @Override
    public String toString() {
        
        return String.format("%s", this.getClass().getSimpleName());
    }
}
