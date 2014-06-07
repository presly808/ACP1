package ua.artcode.week1.day1.bin_tree;

import java.util.Comparator;

/**
 * Created by admin on 07.06.2014.
 */
public class BTreeImpl implements BTree {

    private Node root;

    private class Node {
        Comparable value;
        Node lChild;
        Node rChild;

        private Node(Comparable value, Node lChild, Node rChild) {
            this.value = value;
            this.lChild = lChild;
            this.rChild = rChild;
        }
    }

    @Override
    public void add(Comparable el) {
        if(root == null){
            root = new Node(el, null, null);
        } else {
            add(root, el);
        }
    }

    public void add(Node temp, Comparable el){
        if(temp.value.compareTo(el) > 0) {
            if(temp.rChild == null){
                temp.rChild = new Node(el, null, null);
            } else {
                add(temp.rChild, el);
            }
        } else {
            if(temp.lChild == null) {
                temp.lChild = new Node(el, null, null);
            } else {
                add(temp.lChild, el);
            }
        }
    }

    @Override
    public boolean contains(Comparable el) {
        return true;
    }
}
