package HomeWork.HomeWork6_version2.model;

import java.io.FileWriter;
import java.io.IOException;

public class Recording implements Rec{

    @Override
    public void recording(StringBuilder sb) {
        try{
            FileWriter fw = new FileWriter( "file.txt", true );
            fw.write(sb + "\n");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
