package Iterators;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T>{
   private T[] items;
   private int size;

@SuppressWarnings("unchecked")
public OurGenericList(){
    size=0;
    items=(T[]) new Object[100];
   }

   public void add(T item){
    items[size++]=item;
   }    
   public T getItemAtIndex(int index){
    return items[index];
   }

   @Override
   public Iterator<T> iterator(){
    return new OurGenericListIterator(this);
   }

   private class OurGenericListIterator implements Iterator<T>{
    private OurGenericList<T> list;
    private int index=0;
    private OurGenericListIterator(OurGenericList<T> list){
        this.list=list;
    }
    @Override
    public boolean hasNext(){
        System.out.println("Has next() has called now");
        return index<list.size;
    }

    @Override
    public T next(){
        System.out.println("Next() method has been called now");
        return list.items[index++];
    }
   }

}
