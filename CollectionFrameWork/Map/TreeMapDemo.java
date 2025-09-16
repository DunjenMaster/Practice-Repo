package CollectionFrameWork.Map;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A", 1,"B", 2, "C", 3, "D"));

        System.out.println("Initial TreeMap: " + tm);

        tm.put(4, "E");
        System.out.println("After adding new Key,Value i.e - (4, 'E'): " + tm);

        tm.put(6, "G"); // Adding new key-value pair to showcase of ceilingEntry() method
        // Accessing the exact given value from entered key; if the key is not present it will return the closest higher key value
        System.out.println("Ceiling Entry for key 5: " + tm.ceilingEntry(5));// o/p = (6, "G"); because 5 is not present so it will return the closest higher key value

        Entry<Integer, String> entry = tm.firstEntry();
        System.out.println("First Entry: " + entry);
        System.out.println("Returning the exact key value pair: " + tm.ceilingEntry(2)); // it will return the exact key value pair because 2 is present in the map.
        System.out.println("Deleting the First Entry from the map and return it: " + tm.pollFirstEntry()); // it will remove the first entry from the map and return it.
    }
}
