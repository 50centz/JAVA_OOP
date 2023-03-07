package Seminars.Seminar2;


public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student junior = new Junior();
        Student middle = new Middle();
        Student senior = new Senior();
        students[0] = junior;
        students[1] = middle;
        students[2] = senior;
        Program.getInfo(students);
    }
    
}
