package HomeWork.HomeWork7.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import HomeWork.HomeWork7.presenter.Presenter;

public class Model {
    private Presenter presenter;

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void recording(StringBuilder sb) {
        try{
            FileWriter fw = new FileWriter( "file.txt", true );
            fw.write(sb + "\n");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public StringBuilder read(){
        try{
            FileReader fr = new FileReader("file.txt");
            Scanner scan = new Scanner(fr);
            StringBuilder sb = new StringBuilder();
            while (scan.hasNextLine()){
                sb.append(scan.nextLine() +"\n");
            }
            fr.close();
            return sb;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
