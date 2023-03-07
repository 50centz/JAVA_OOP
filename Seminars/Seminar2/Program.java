package Seminars.Seminar2;

public class Program {
    
        // Абстракция  
        // Инкапсуляция  Скрытие процесса от пользователя, как работает 
        // Наследование  Создание нового класса наследованного от базового класса   
        // Полиморфизм  Множественное поведение,  можно хранить разные типы данных , можно пользоваться всеми подклассными объектами

        /*
        * На языке программирования Java создать следующую иерархию школьников:
        1. Младшеклассник, у которого реализовать следующие методы:
        1.1 Учиться, выводящий на экран фразу "Я люблю учиться"
        1.2.  Играть, выводящий на экран фразу "Я играю в игрушки"
        1.3. Ходить в продлёнку, выводящий на экран фразу "Я хожу в продлёнку"
        2. Ученик средней школы, у которого реализовать следующие методы:
        2.1 Учиться, выводящий на экран фразу "Я ненавижу учиться"
        2.2. Играть, выводящий на экран фразу "Я играю в Minecraft"
        2.3. Курить, выводящий на экран фразу "Я начинаю курить"
        3. Старшеклассник, у которого реализовать следующие методы:
        3.1. Учиться, выводящий на экран фразу "Я должен учиться"
        3.2. Курить, выводящий на экран фразу "Я бросаю курить"
        3.3.  Влюбляться, выводящий на экран фразу "Я ищу любовь"
        В классе Program реализовать метод, вызывающий все метода переданного объекта-школьника, 
        а в методе main создать массив школьников, и для каждого элемента массива вызывать указанный метод класса Program
        */

        public static void getInfo(Student[] students){
            for (Student student: students) {
                System.out.println(student.getClass().getSimpleName());
                student.study();
                if (student instanceof Play){
                    ((Play) student).play();
                }
                if (student instanceof Smoke){
                    ((Smoke) student).smoke();
                }
                if (student instanceof Love){
                    ((Love) student).love();
                }
                if (student instanceof Go){
                    ((Go) student).goExtension();
                }
                System.out.println();
            }
        }
    
}
