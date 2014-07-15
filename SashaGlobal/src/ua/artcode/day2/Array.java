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
        if(index >= mas.length) {
            resizeMas(mas.length * 2);
        }
        offset(pos, 1, true);

        mas[pos] = val;
    }

    private void offset(int pos, int offset, boolean way){
        if(way){
            for(int i = index - 1; i >= pos; i--){
                mas[i+offset] = mas[i];
            }
        } else {
            for(int i = pos + 1; i < index; i++){
                mas[i-offset] = mas[i];
            }
        }
    }

    public int remove(){
        index--;
        return mas[index];
    }

    //TODO
    public int remove(int pos){
        int removed = mas[pos];
        offset(pos, 1, false);
        index--;
        return removed;
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
