package Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class PriorityQueueExample {
    public static List<StudentMarks> marks=new ArrayList<>();
    public static void main(String[] args){
        //Normal Priority Queue which is sorted
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);
        List<Integer> bottom2=new ArrayList<>();
        int index=0;
        //Returns the bottom 2 elements from the queue
        while(!pq.isEmpty()){
            if(index==2){
                break;
            }
        bottom2.add(pq.poll());
        index++;
        }

        System.out.println(bottom2);
        System.out.println(pq);

        //Returns top3 based on Students maths marks
        List<StudentMarks> marks=new ArrayList<>();
        marks.add(new StudentMarks(70,80));
        marks.add(new StudentMarks(38, 10));
        marks.add(new StudentMarks(100, 38));
        marks.add(new StudentMarks(40, 88));
        marks.add(new StudentMarks(97, 19));
        PriorityQueue<StudentMarks> spq=new PriorityQueue<StudentMarks>((s1,s2)->
    {
        System.out.println("Comparators Compareto() is called");
        return s1.getMaths()-s2.getMaths();
        });
        spq.addAll(marks);
        List<StudentMarks> top3=new ArrayList<>();
        int index1=0;
        while(!spq.isEmpty()){
            if(index1==3){
                break;
            }
            top3.add(spq.poll());
            index1++;
        }
     System.out.println(spq);
    }
    
}
