package CollectionFrameWork.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class LinkedListDemo1 {
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<>();

        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50,60,70,80,90));

        ll1.add(10);
        ll1.add(0,5);
        ll1.addAll(1,ll2);

        ll1.set(6,100);

        ll1.addFirst(3);
        ll1.addLast(200);

        ll1.peek(); // returns first element or head element
        ll1.peekFirst(); // returns first element or head element
        ll1.peekLast(); // returns last element or tail element


        ll1.forEach(n->show(n));


    }

    static void show(int n)
    {
        //if(n==0)
            System.out.println(n);
    }
}
