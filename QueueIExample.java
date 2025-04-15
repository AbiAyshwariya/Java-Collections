import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;

public class QueueIExample {
    public static void main(String[] args){
        //FIFO Queue
        System.out.println("FIFO Queue");
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        System.out.println(q.peek());//Returns the first element (1)
        System.out.println(q.poll());//Remove the first element
        System.out.println(q.peek());//Returns the current first element
        System.out.println(q.isEmpty());//Returns true if the queue is empty
        
        //Stack Implementation (Last In First Out Implementation(LIFO))
        System.out.println("LIFO Queue");
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }

        //FIFO and Double ended Queue (Stack Implementation-Array Deque)
        System.out.println("Double ended Queue");
        Deque<Integer> dq=new ArrayDeque<>();//Since it is double ended it provides both first and last operatios
        dq.offerFirst(1);
        dq.offerLast(2);
        System.out.println(dq);
        dq.pollFirst();
        dq.peekFirst();
        System.out.println(dq);
        
        // When u wanted use as a normal queue(Insertion at rear end and Deletion from first end)
        System.out.println("Usual Queue");
        Deque<Integer> dq1=new ArrayDeque<>();
        dq1.offerLast(1);
        dq1.offerLast(2);
        System.out.println(dq1);
        dq1.pollFirst();
        dq1.peekFirst();
        System.out.println(dq1);


    }
}
