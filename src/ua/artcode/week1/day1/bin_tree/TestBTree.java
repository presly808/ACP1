package ua.artcode.week1.day1.bin_tree;

/**
 * Created by admin on 07.06.2014.
 */
public class TestBTree {


    public static void main(String[] args) {
        Integer[] mas = {50,12,78,45,99,1,-56};

        System.out.println();
        System.out.println();
        BTree bTree = new BTreeImpl();
        for(Integer i : mas){
            bTree.add(i);
        }
        System.out.println("Some");
    }
}
