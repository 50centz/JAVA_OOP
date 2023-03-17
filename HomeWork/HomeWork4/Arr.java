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


    private void addAllElements(){
        for (E1 object : e1) {
            arr.add(object);
        }
        this.size = arr.size();
    }

    public void add(Object obj){   //1
        arr.add(obj);
    }

    public void remove(int index){  //2
        arr.remove(index);
    }

    public void removeElement(E1 e1){  //3
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(e1)){
                arr.remove(i);
                i--;
            }
        }
    }

    public int getMin(){                //4
        int min = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer && arr.get(i - 1) instanceof Integer){
                if ((int)arr.get(i) < (int)arr.get(i - 1)){
                    min = (int) arr.get(i);
                }
            }
        }
        return min;
    }


    public int getMax(){                //5
        int max = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer && arr.get(i - 1) instanceof Integer){
                if ((int)arr.get(i) > (int)arr.get(i - 1)){
                    max = (int) arr.get(i);
                }
            }
        }
        return max;
    }
    
    public int getSum(){                   //6
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer){
                sum += (int)arr.get(i);
            }
        }
        return sum;
    }
    
    public int getMultiplication(){                   //7
        int multi = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer){
                multi *= (int)arr.get(i);
            }
        }
        return multi;
    }

    public int indexSearch(E1 e1){                     //8
        
        for (int i = 0; i < arr.size(); i++) {
            if (this.arr.get(i).equals(e1)){
                return i + 1;
            }
            
        }
        return -1;
    }

    public boolean elementSearch(E1 e1){                     //9
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(e1)){
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() {                               //10
        for (int i = 0; i < this.arr.size(); i++) {
            for (int j = 1; j < this.size - 1; j++) {
                if (arr.get(j) instanceof Integer && arr.get(j - 1) instanceof Integer){
                    if((Integer)arr.get(j) < (Integer)arr.get(j - 1)){
                        var temp = arr.get(j);
                        var temp1 = arr.get(j - 1);
                        arr.remove(j);
                        arr.remove(j - 1);
                        arr.add(j, temp1);
                        arr.add(j - 1, temp);
                    }
                }
            }
        }
    }


    public void selectSort() {                                //12
        int min = 0;
        int index = 0;
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            if (arr.get(i) instanceof Integer){
                min = (int)arr.get(i);
            }
            for (int j = i; j < size; j++) {
                if (arr.get(j) instanceof Integer ){
                    if(min > (int)arr.get(j)){
                        min = (int)arr.get(j);
                        index = j;
                    }
                }
            }
            if (arr.get(i) instanceof Integer){
                int temp1 = (int)arr.get(i);
                if (temp1 > min){
                arr.add(i, min);
                arr.remove(index + 1);
                }
            }
            // int temp1 = (int)arr.get(i);
            // if (temp1 > min){
            //     arr.add(i, min);
            //     arr.remove(index + 1);
            // }
        }
    }



    public E1 getElement(int index){                          //13
        E1 result = (E1)arr.get(index);
        return result;
    }


    public void setElementIndex(E1 e1, int index){             //14
        arr.remove(index);
        arr.add(index, e1);
    }

    public void printArr(){                                      //15
        for (Object object : arr) {
            System.out.println(object);
        }
    }

    public int getSize(){                                       //16
       return size;
    }


    
}
