// Note: Priority Queue is based on the Min Heap data structure. In this example the priority is given to the smallest number.

package CollectionFrameWork.PriorityQueueDemo;

import java.util.PriorityQueue;

public class PQ1 {
    public static void main(String[] args){

        PriorityQueue <Integer> p = new PriorityQueue<>();
        // Insertion of element in the queue.
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek()); // Shows the head element of the queue.

        p.forEach((i)-> System.out.println(i));

        //Deletion of the element from the queue. It will delete the head or root element of the queue.
        p.poll();

        System.out.println("After deletion");
        p.forEach((x) -> System.out.println(x));

    }
}
