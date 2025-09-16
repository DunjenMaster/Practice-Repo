// Demonstrates the use of LinkedHashMap in Java. With Only Initial Capacity as 5.

package CollectionFrameWork.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(5);

        lhm.put("A", 1);
        lhm.put("B", 2);
        lhm.put("C", 3);

        System.out.println("Initial LinkedHashMap: " + lhm); // Printing with toString() via println.
        lhm.forEach((k,v) -> System.out.println(k + " : " + v)); // Using forEach with lambda expression to print key-value pairs.
    }
}
