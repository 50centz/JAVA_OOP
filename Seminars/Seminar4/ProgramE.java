package Seminars.Seminar4;

import com.google.gson.Gson;

public class ProgramE {
    static String toJson(Object obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }
    public static void main(String[] args) {
        // Написать метод получения строки в формате JSON, который будет работаеть
        // для следующих видов объектов: целое число, строка, объект известного класса(например, Cat).

//        int num = 123;
//        String str = "Hello world";
//        Cat cat = new Cat("Барсик", 45);

//        String numJson = toJson(num);
//        String strJson = toJson(str);
//        String catJson = toJson(cat);
//
//        System.out.println(numJson);
//        System.out.println(strJson);
//        System.out.println(catJson);

        int number = 2;
        // GetJson.returnJson(number);
        System.out.println(GetjsonE.returnJson(number));

        String someSring = "Hello";
        System.out.println(GetjsonE.returnJson(someSring));

        CatE cat = new CatE("Boris", 50);
        System.out.println(GetjsonE.returnJson(cat));
    }
}
