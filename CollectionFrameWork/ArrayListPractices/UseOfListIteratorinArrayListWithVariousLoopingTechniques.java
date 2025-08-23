package CollectionFrameWork.ArrayListPractices;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UseOfListIteratorinArrayListWithVariousLoopingTechniques {
    public static void main(String[] args) {
        ArrayList<Integer> arraylst= new ArrayList<>(List.of(11,22,33,44,55,66));

        //ListIterator is bidirectional iterator which can traverse the list in both directions.
        ListIterator<Integer> it = arraylst.listIterator();

        //ListIterator with while loop to traverse in the array list "arraylst" in forward direction.
        while(it.hasNext()){
            System.out.print(it.next());
        }


        System.out.println();

        /*
        ListIterator with For loop to traverse in the array list "arrayl" in forward direction.
        Note in the below for initialization we have used listIterator() method of the ArrayList class to get the ListIterator object.
        And condition is used to check if there is next element or not i.e hasNext().
        There is no updation part in the for loop as the updation is done inside the loop using next() method.
        */
        for(ListIterator<Integer> lit = arraylst.listIterator(); lit.hasNext();)
        {
            System.out.print(lit.next());
        }

        System.out.println();

        // For Each method of list class to traverse
        arraylst.forEach(n-> System.out.print(n));
        System.out.println();
        // OR we call a static method which is outside the main method with forEach and lambda expression.
        arraylst.forEach(n->show(n));

        System.out.println();

        // For Each method with method reference to traverse
        arraylst.forEach(System.out::print);

    }

    static void show(int n){
        if(n>30)
            System.out.print(n);
    }
}