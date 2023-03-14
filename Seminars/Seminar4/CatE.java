package Seminars.Seminar4;

public class CatE {
    private String name;
    private int height;

    public CatE(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "{\"name\": \"" + name + "\", \"height\": " + height + "}";
    }
}
