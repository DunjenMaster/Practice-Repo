package CollectionFrameWork.ArrayListPractices;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorInArrayListDemo {

    public static void main(String[] args)
    {
        ArrayList <Integer> al1 = new ArrayList<>(15);
        al1.add(10);
        al1.add(0,5);
        System.out.println("ArrayList al1: " + al1);
        al1.add(0,0);
        System.out.println("ArrayList al1 after adding 0 at index 0: " + " " + al1);

        System.out.println("=========================================");

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
        al1.addAll(3,al2);
        System.out.println("ArrayList al1 after adding al2 at index 3: " + " " +al1);
        System.out.print("ArrayList al1 after set al1 at index 4: " + al1.set(4, 500) + " ->");
        System.out.println(" " + al1);

        System.out.println("\nAbove ones are the examples of using the add, addAll and set methods in ArrayList");

        System.out.println("=========================================");

        System.out.println("## Using Iterator to iterate through the ArrayList");

        //Example of using the for loop to access all the elements of the ArrayList
        System.out.println("Using for loop");
        for (int i = 0; i < al1.size(); i++) {
            System.out.print(" " + al1.get(i));
        }
        System.out.println();

        // with for-each loop and var(instead of integer)
        System.out.println("Using for-each loop with var");
        for (var x : al1) {
            System.out.print(" " + x);
        }
        System.out.println();

        // with iterator with while loop
        Iterator<Integer> it = al1.iterator();
        while (it.hasNext()){
            System.out.print(" "+ it.next());
        }

        System.out.println();

        //With Lambda Expression
        System.out.println("With Lambda Expression");
        al1.forEach((x) -> {
            System.out.print(" " +x);
        });

    }
}
