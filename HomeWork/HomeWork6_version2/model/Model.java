package HomeWork.HomeWork6_version2.model;


import java.io.IOException;


import HomeWork.HomeWork6_version2.presenter.Presenter;

public class Model {
    private Presenter presenter;
    private Recording recording;
    private Reading reading;

    public Model(){
        recording = new Recording();
        reading = new Reading();
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void recording(StringBuilder sb) {
       recording.recording(sb);
    }

    public StringBuilder read() throws IOException{
        return reading.read();
    }
}
