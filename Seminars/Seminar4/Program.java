package Seminars.Seminar4;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
    

public class Program {
    /*
     * Написать метод получения строки в формате JSON, 
     * который будет работаеть для следующих видов объектов: целое число, строка, объект известного класса(например, Cat).
     */


    
    
     
        public static void main(String[] args) {
            String res1 = toJson(123);
            String res2 = toJson("Строка");
            String res3 = toJson(new cat.Cat("Barsik", 5, "Siam"));
            String res4 = toJson(3.14);
    
            System.out.println(res1);
            System.out.println(res2);
            System.out.println(res3);
            System.out.println(res4);
        }
    
        public static <Integer, String, Cat> java.lang.String toJson(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            if (obj instanceof java.lang.Integer) {
                sb.append(obj);
            }
            if (obj instanceof java.lang.String) {
                sb.append("\"")
                        .append(obj)
                        .append("\"");
            }
            if (obj instanceof cat.Cat) {
                Iterator<Field> iterator = Arrays.stream(obj.getClass().getDeclaredFields()).iterator();
                while (iterator.hasNext()){
                    Field field = iterator.next();
    //                field.setAccessible(true);
                    try {
                        sb.append("\"")
                                .append(field.getName())
                                .append("\": ");
                        Object fieldValue = field.get(obj);
                        sb.append(fieldValue);
                    } catch (IllegalAccessException e) {
    
                    }
                    if (iterator.hasNext()) sb.append(", ");
                }
            }
            sb.append("}");
            return sb.toString();
        }
    }

