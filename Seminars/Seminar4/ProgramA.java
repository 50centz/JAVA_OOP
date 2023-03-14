package Seminars.Seminar4;

import java.util.ArrayList;
import java.util.List;

public class ProgramA {
     // {"name":Барсик, "hight": 20}
     public static void main(String[] args) {
        String str = "Hello";
        int number = 3;
        CatA barsik = new CatA("Барсик", 20);        
        GetJsonA o1 = new GetJsonA<>(number);
        System.out.println(o1.getJson());

        String str2 = "{\"name\":Барсик, \"hight\": 20}";
        GetJsonA o2 = new GetJsonA<>(str2);
        System.out.println(o2.getObject(str2));
    }
}
