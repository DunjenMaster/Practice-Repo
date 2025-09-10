package CollectionFrameWork.HashingTechnique;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){

        // HashSet does not allow duplicate values. And it does not maintain any order.
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(20);
        hs.add(30);
        hs.add(60);
        System.out.println(hs);
    }
}
