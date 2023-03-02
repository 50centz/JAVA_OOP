package Lectures.Lecture1.Ex004;

public class Program {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("name_1", 1);
        System.out.printf("%s %d\n", robot1.name, robot1.level);

        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();


        robot1.work();
        robot1.work();
        robot1.work();
        

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBios();

    }
}
