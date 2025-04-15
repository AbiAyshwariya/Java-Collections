package Collections;
import java.util.*;

import javax.swing.tree.TreeCellRenderer;

public class TreeSetExample {
    public static void main(String[] args){
        Set<StudentMarks> treeset=new TreeSet<>((s1,s2)->s2.getPhysics()-s1.getPhysics());
        treeset.add(new StudentMarks(70, 80));
        treeset.add(new StudentMarks(38, 10));
        treeset.add(new StudentMarks(100, 38));
        treeset.add(new StudentMarks(40, 88));
        treeset.add(new StudentMarks(97, 19));
    
    for(StudentMarks x:treeset){
        System.out.println(x+"");
    }

    Set<Integer> set5=new TreeSet<>();
    set5.add(8);
    set5.add(2);
    set5.add(1);
    set5.add(0);
    for(int x:set5){
        System.out.println(x+"");
    }
    System.out.println("TreeSet Example: ");
    NavigableSet<Integer> set6=new TreeSet<>();
    set6.add(8);
    set6.add(2);
    set6.add(1);
    set6.add(0);
    System.out.println(set6.floor(2));
    System.out.println(set6.ceiling(2));
    System.out.println(set6.higher(2));
    System.out.println(set6.lower(3));

    NavigableMap<Integer,String> tmap=new TreeMap<>();
    tmap.put(1,"riddhi");
    tmap.put(2,"raj");
    tmap.put(3,"chandler");
}}
