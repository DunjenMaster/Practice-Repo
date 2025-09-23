package CollectionFrameWork.ArraysComparator;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){

        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5,7};

        int c[] = Arrays.copyOfRange(a,4,8);
        int d[] = Arrays.copyOf(a,a.length);

        System.out.println(Arrays.toString(c));

        for(int x : c){
            System.out.println(x);
        }
        System.out.println();
        for(int x : d){
            System.out.println(x);
        }
        System.out.println();

        // Binary Search: Remember it can only be performed on sorted array.
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.binarySearch(d,2)); // It will return index of 2 in sorted array d.

    }
}
