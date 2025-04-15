import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListIteratorExample {
    public static void main(String[] args){
        List<Integer> lk=new LinkedList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(4);
        ListIterator<Integer> iterator=lk.listIterator();
        System.out.println(iterator.next());//Returns the elements first and then moves the pointer
        System.out.println(iterator.hasNext());
        System.out.println(iterator.previous());//moves the pointer to the previous index first and then returns the elements
        

    }
}
