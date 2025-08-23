package CollectionFrameWork.ArrayListPractices;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorInArrayList {
    public static void main(String[] args){

        ArrayList<Integer>  array_list = new ArrayList(List.of(10,20,30,40,50));

        array_list.add(5,100);
        System.out.println(array_list);


        //Iterator initialisation
        Iterator<Integer> it = array_list.iterator();
        //using iterator with while loop
        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
