import java.util.List;
import java.util.ArrayList;
public class ArrayLisExample {
    public static void main(String[] args){
        List<Integer> alist=new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.set(2,200);
        System.out.println("Elements that got replaced: "+alist.set(1, 100));
        System.out.println(alist);//ToString method works in the behind
      
        //Copying the elements of alist1 to alist2
        List<Integer> alist2=new ArrayList<>(alist);
        alist2.add(4);
        alist2.add(5);
        alist2.add(7);
        alist2.add(8);
        System.out.println("ArrayList 2: ");
        System.out.println(alist2);

        List<Integer> alist3=new ArrayList<>();
        alist3.addAll(alist2);
        System.out.println("ArrayList 3"+alist3);
        System.out.println("First Occurance of the element 4:"+alist2.indexOf(4));
        System.out.println("Last Occurance of the element 4: "+alist2.lastIndexOf(4));

        //Slicing in Java
        List<Integer> alist4=alist3.subList(1, 4);
        System.out.println("ArrayList4: "+alist4);
        alist4.set(0,500);//Shallow copy which affects the list from which it is obtained
        System.out.println("ArrayList4: "+alist4);
        System.out.println("ArrayList 3: "+alist3);

        //Converting arrayList to Array 
        Integer[] arr=alist.toArray(new Integer[0]);
        for(int x:arr){
            System.out.print(x+",");
        }
    }

}
