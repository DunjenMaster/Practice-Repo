package CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0,"A", 1,"B", 2, "C", 3, "D"));

        System.out.println("Initial HashMap: "+hm);
        /*
        Note : HashMap doesn't maintain any order of its elements. so the output order may vary each time you run the program.
               Due to which no indexing concept is there in HashMap.
        */


        hm.putIfAbsent(4, "E"); // Adding new key-value pair to the map if the key is not already present in the map.
        System.out.println("After adding new Key,Value i.e - (4, 'E'): " + hm);


    }
}
