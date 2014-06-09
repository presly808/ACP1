package ua.artcode.week1.day2;

import java.util.*;

/**
 * Created by admin on 08.06.2014.
 */
// Alt + Enter  QuickFix
public class TestCollections {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Some", "New", "AString",  "DElem");
        // Set, Map, List,

        // List ArrayList LinkedList
        // Set  TreeSet   TreeMap
        // Map

        // Use interface reference
        Set<String> set = new TreeSet<String>();
        set.addAll(list);

        System.out.println("\nOut treeset");
        for(String s : set){
            System.out.println(s);
        }

        //HashTable  -> Quick Find, Add, Delete

        set = new HashSet<String>();

        set.addAll(list);

        System.out.println("\nOut hashset");
        for(String s : set){
            System.out.println(s);
        }

        ManForHash m1 = new ManForHash("Vova", 25);
        ManForHash m2 = new ManForHash("Vova", 25);
        ManForHash m3 = new ManForHash("Vasia", 45);
        ManForHash m4 = new ManForHash("Bogdan", 23);

        Set<ManForHash> menSet = new HashSet<ManForHash>();
        menSet.add(m1);
        menSet.add(m2);
        menSet.add(m3);
        menSet.add(m4);

        System.out.println("\nMen set");
        Iterator<ManForHash> iter = menSet.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode() + " : " + m2.hashCode());

    }
}
