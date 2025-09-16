package CollectionFrameWork.Map;

import java.util.LinkedHashMap;
import java.util.Map;


public class LHMWithLoadingFactor {
    public static void main(String[] args){

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F"); // This will cause a rehash if the load factor is exceeded.
        String s=lhm.get(3); // Accessing "C" to demonstrate access-order.
        s = lhm.get(5); // Accessing "E" to demonstrate access-order.


        lhm.forEach((k,v) -> System.out.println(k + " : " + v)); // Using forEach with lambda expression to print key-value pairs.
    }
}
