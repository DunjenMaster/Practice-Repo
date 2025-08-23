package CollectionFrameWork.ArrayListPractices;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ArrayListWithVariousLoopingTechniques {

    public static void main(String[] args){

        ArrayList<Integer> al3 = new ArrayList<>(List.of(50,60,70,80,90));

        al3.add(100); // 100 is added without using the index; so it wil be added at the end of the list.
        System.out.println(al3);

        al3.add(2,5); // here 5 is added at index 2.
        System.out.println(al3);

        // Now we will create another arraylist of integers, and we will add those to the al3 array;ist initiated above
         ArrayList<Integer> al4 = new ArrayList<>(List.of(1,2,3,4,5));

         //Here we will add al4 to al3 at index 0;
        al3.addAll(0,al4);
        System.out.println(al3);

        //Now we wil remove the element at 7th index which is 5 and replace it with 66 using set method.
        al3.set(7,66);
        System.out.println(al3);

        // Regular for loop to print all the elements of al3
        for(int i =0; i<al3.size();i++){
            //System.out.println(al3[i]); //Note:-> This will give error as we cannot use array [] to access the elements of the ArrayList.
            System.out.print(al3.get(i)); // We have to use get() method to access the elements of the ArrayList.
        }

        System.out.println();

        // Now we will print all the elements of the al3 using for-each loop
        for(Integer x: al3){
            System.out.print(x);
        }

        System.out.println();

        // If we don't know the object type or class name of the object then we can use var keyword instead of Integer,String etc.
        for(var y:al3){
            System.out.print(y);
        }

        System.out.println();

        // Instead of using for-each loop we can also use the Iterator to iterate through the ArrayList inside for loop.
        for(Iterator<Integer> it = al3.iterator(); it.hasNext();) {
            Integer z = it.next();
            System.out.print(z);
        }

        System.out.println();


        // We can also use the Lambda Expression to iterate through the ArrayList
        al3.forEach((a)-> {
            System.out.print(a);
        });

        System.out.println();

        // Now instead of using the Lambda Expression we can also use the method reference to iterate through the ArrayList
        al3.forEach(System.out::print);

    }
}
