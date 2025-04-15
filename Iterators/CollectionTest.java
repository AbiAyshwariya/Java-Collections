package Iterators;

import java.util.Iterator;

public class CollectionsTest {
    public static void main(String[] args){
        OurGenericList<Integer> list=new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Throws an error because <list> is declared private within 
        //its own class hence cannot be accessed --- > Resolved by using Iterable
        for(int num:list){
            System.out.println(num);
        }

        //Implements the prevuously declared methods
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
