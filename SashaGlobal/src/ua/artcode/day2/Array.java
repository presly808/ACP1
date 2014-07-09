package ua.artcode.day2;

/**
 * Created by admin on 09.07.2014.
 */
public class Array {

    private int[] mas = new int[10];
    private int index = 0;

    //default constructor
    public Array(){

    }

    //overloaded
    public Array(int size){
        mas = new int[size];
    }

    public Array(int[] mas){
        this.mas = mas;
        index = mas.length;
    }

    public void insert(int val){
        if(index >= mas.length) {
            resizeMas(mas.length * 2);
        }
        mas[index] = val;
        index++;
    }

    //TODO
    public void insert(int pos, int val){

    }

    public int remove(){
        index--;
        return mas[index];
    }

    //TODO
    public int remove(int pos){
        return -1;
    }

    private void resizeMas(int newSize){
        int[] newMas = new int[newSize];
        copyMasTo(mas, newMas);
        mas = newMas;
    }

    private void copyMasTo(int[] src, int[] dest){
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }

    public void printArr(){
        if(index < 1){
            System.out.println("{}");
            return; // like break for loop
        }

        String res = "{";
        for(int i = 0; i < index - 1; i++){
            res += mas[i] + ",";
        }

        res += mas[index - 1] + "}";
        System.out.println(res);
    }

}
