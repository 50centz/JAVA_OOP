package HomeWork.HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Arr<E1> {

    private E1[] e1;
    private List  arr;
    private int size ;


    public Arr(){
        this.arr = new ArrayList<>();
    }

    public Arr(E1[] e1){
        this.e1 = e1;
        this.arr = new ArrayList<>();
        addAllElements();
    }


    public void addAllElements(){
        for (E1 object : e1) {
            arr.add(object);
        }
    }

    public void add(Object obj){
        arr.add(obj);
    }

    public void remove(int index){
        arr.remove(index);
    }

    public E1 getElement(int index){
        E1 result = (E1)arr.get(index);
        return result;
    }

    public int size(){
       return arr.size();
    }


    
}
