package CollectionFrameWork.ArrayDequePractice;

import java.util.ArrayDeque;


public class ArrayDequeDemo {
    public static void main(String[] args){
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        // offerLast() method follows the FIFO order, it adds the elements at the end of the deque.
        ad1.offerLast(10); System.out.println(ad1);
        ad1.offerLast(20); System.out.println(ad1);
        ad1.offerLast(30); System.out.println(ad1);
        ad1.offerLast(40); System.out.println(ad1);
        ad1.offerLast(50); System.out.println(ad1);

        //ad1.forEach((x) -> System.out.println(x));

        ad1.forEach(System.out::println);

        System.out.println("=====================================Adding the number for first as it will believe like Stack====================================================");

        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        //offerFirst() method follows the LIFO order, it adds the elements at the front of the deque.
        ad2.offerFirst(1); System.out.println(ad2);
        ad2.offerFirst(2); System.out.println(ad2);
        ad2.offerFirst(3); System.out.println(ad2);
        ad2.offerFirst(4); System.out.println(ad2);
        ad2.offerFirst(5); System.out.println(ad2);



        ad2.forEach((x)-> System.out.println(x));


    }
}
