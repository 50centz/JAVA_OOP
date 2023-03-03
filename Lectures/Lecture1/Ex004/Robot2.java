package Lectures.Lecture1.Ex004;

/**
 * Robot2
 */
public class Robot2 {

    /**Уровень робота */
    private int level;     // Поля

    /**Eимя робота */
    private String name;
    
    
    //ctor Конструктор

    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    //Методы вкл/выкл подсистем

    public void powerOn(){    // Методы
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }


    /**Загрузка BIOS */
    private void startBIOS(){
        System.out.println("Start BIOS ...");
    }

    /**Загрузка OS */
    private void startOS(){
        System.out.println("Start OS ...");
    }
    /**Приветствеие */
    private void sayHi(){
        System.out.println("Hello world ...");
    }

    /**Выгрузка BIOS */
    private void stopBIOS(){
        System.out.println("Stop BIOS ....");
    }

    /**Выгрузка OS */
    private void stopOS(){
        System.out.println("Stop OS ...");
    }

    /**Прощание */
    private void sayBye(){
        System.out.println("Bye ...");
    }
}