package Collection_Framework;

// import java.util.ArrayDeque;
import java.util.LinkedList;
// import java.util.PriorityQueue;
import java.util.Queue;

public class queues_01 {
    public static void main(String[] args) {
        //  CREATION OF QUEUE IN 3 DIFFERENT WAYS :
        Queue <Integer> q1=new LinkedList<>();
        // Queue <Integer> q2=new ArrayDeque<>();
        // Queue <Integer> q3=new PriorityQueue<>();
        // ADDING ELEMENTS INTO Q1
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println(q1);
        // REMOVING HEAD FROM THE QUEUE
        q1.poll();
        System.out.println("Queue after removing first element : "+q1);
        // PEEKING HEAD OF THE QUEUE
        System.out.println("Head of the queue : "+q1.peek());
    }
}
