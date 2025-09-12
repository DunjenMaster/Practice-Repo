package CollectionFrameWork.HashingTechnique_Set;

import java.util.TreeSet;
import java.util.List;

public class TreeSetDemo1 {
    public static void main(String[] args){

        // TreeSet does not allow duplicate values. And it maintains a sorted order.
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,50,70,40));

        //Either you can add like this or we can add by using the List of above inside TreeSet<>();
        /*ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.add(60);
        */
        System.out.println(ts);
    }
}
