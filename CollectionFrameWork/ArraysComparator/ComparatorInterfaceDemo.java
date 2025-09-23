package CollectionFrameWork.ArraysComparator;

import java.util.Arrays;
import java.util.Comparator;


//Define our own Comparator to sort it in reverse order

class MyComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2){
        if(i1<i2){
            return 1;
        }else if(i1>i2){
            return -1;
        }else return 0;
    }
}

public class ComparatorInterfaceDemo {
    public static void main(String[] args){

        Integer a[] = {2,4,6,8,1,3,5,7};

        Arrays.sort(a);// It will sort in ascending order here Comparable Interface is used.
        Arrays.sort(a, new MyComparator()); // It will sort in descending order(reverse order) because of our own comparator.

        for(Integer x : a){
            System.out.println(x);
        }
    }
}
