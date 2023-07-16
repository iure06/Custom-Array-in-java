package PersonalArrayClass;

import java.util.Arrays;

public class PersonalArray {
    Object[] array;

    public PersonalArray(){
        array = new Object[1];
    }

    public <T> void add(T valor){
        int index = array.length;
        if (array[index - 1] == null){
            array[index - 1] = valor;
        }else{
            Object[] newArray = new Object[index + 1];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
            array[index] = valor;
        }
    }

    public void print(){
        System.out.println(Arrays.toString(array));
    }

    public int size(){
        return array.length;
    }

    public void clear(){
        array = new Object[1];
    }

    public void isEmpty(){
        if (array[0] == null){
            System.out.println("This array is empty");
        }else{
            System.out.println("This array is not empty");
        }
    }

    public Object get(int index){

        if(index > (array.length - 1)){
            System.out.println("Index not available");
        }else{
            return array[index];
        }
        return null;
    }

    public <T> int indexOf(T element){
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]){
                return i;
            }
        }
        return -1;
    }

    public <T> void removeElement(T element){
        int index = indexOf(element);
        if (index < 0){
            System.out.println("Element not found");
        }else{
            remove(index);
        }

    }

    public void remove(int index){
        if (index > (array.length-1)){
            System.out.println("Index not available");
        }else{
            Object[] newArray = new Object[array.length-1];
            for (int i = 0; i < array.length; i++) {
                if (i > index){
                    newArray[i - 1] = array[i];
                }else if (i != index){
                    newArray[i] = array[i];
                }
            }
            array = newArray;
        }
    }

    public <T> void add(int index, T element){

        if (index > (array.length - 1 )){
            System.out.println("Index not available");
        }else{
            Object[] newArray = new Object[array.length + 1];
            for (int i = 0, j = 0; i < array.length; i++, j++) {
                if (j == index){
                    newArray[j] = element;
                    newArray[j + 1] = array[i];
                }else if(j < index){
                    newArray[j] = array[i];
                }else {
                    newArray[j+1] = array[i];
                }
            }
            array = newArray;
        }





    }


}
