package CollectionFrameWork.ArrayListPractices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorPractice {
    public static void main(String[] args)
    {
        ArrayList<Integer> al1 = new ArrayList<>(List.of(10,20,30,40,50));
        Iterator<Integer> it = al1.iterator();
        // Using Iterator with while loop to iterate through the ArrayList
        while (it.hasNext())
        {
            System.out.println("Current Element: " + it.next());
        }


        ListIterator<Integer> lt = al1.listIterator();
        // Using ListIteratorDemo2-Iterator with while loop to iterate through the ArrayList
        while(lt.hasNext())
        {
            lt.next();
        }
        while (lt.hasPrevious())
        {
            System.out.println("Previous Element: " + lt.previous());
        }

        // Using for loop to iterate through the ArrayList
        for(ListIterator<Integer> i = al1.listIterator();i.hasNext();)
        {
            System.out.println("For Loop Element: " + i.next());
        }
    }
}
