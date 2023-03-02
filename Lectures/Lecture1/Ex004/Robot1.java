package Lectures.Lecture1.Ex004;

public class Robot1 {
    /**Уровень робота */
    public int level;

    /**Eимя робота */
    public String name;

    //ctor Конструктор

    public Robot1(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Методы вкл/выкл подсистемы

    /**Загрузка BIOS */
    public void startBIOS(){
        System.out.println("Start BIOS ...");
    }

    /**Загрузка OS */
    public void startOS(){
        System.out.println("Start OS ...");
    }
    /**Приветствеие */
    public void sayHi(){
        System.out.println("Hello world ...");
    }

    /**Выгрузка BIOS */
    public void stopBios(){
        System.out.println("Stop BIOS ....");
    }

    /**Выгрузка OS */
    public void stopOS(){
        System.out.println("Stop OS ...");
    }

    /**Прощание */
    public void sayBye(){
        System.out.println("Bye ...");
    }

    /**Работа */
    public void work(){
        System.out.println("Working ...");
    }
}    

