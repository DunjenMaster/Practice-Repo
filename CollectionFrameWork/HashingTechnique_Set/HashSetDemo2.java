package CollectionFrameWork.HashingTechnique_Set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args){

        // Showing the Loading Factor of HashSet.
        HashSet<Integer> hs = new HashSet<>(20,0.75f);
        // Only 75% of the table will be used; meaning only 5 elements can be added. It will auto increase based on the insertion of elements.
        // Here 25% of the space will be wasted. Only use when you require the constant time performance.

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
