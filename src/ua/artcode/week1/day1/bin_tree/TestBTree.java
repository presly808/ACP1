package ua.artcode.week1.day1.bin_tree;

/**
 * Created by admin on 07.06.2014.
 */
public class TestBTree {


    public static void main(String[] args) {
        Integer[] mas = {33,22,56,34,12,12,45,23};

        BTree bTree = new BTreeImpl();
        for(Integer a : mas){
            bTree.add(a);
        }
        System.out.println("Some");
    }
}
