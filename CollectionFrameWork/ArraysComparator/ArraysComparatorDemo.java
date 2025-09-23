package CollectionFrameWork.ArraysComparator;

import java.util.Arrays;

public class ArraysComparatorDemo {
    public static void main(String[] args){

        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(a,b));

        int c[] = {2,4,6,8,1,3,5,7};
        int d[] = {2,4,6,8,1,3,5};
        System.out.println(Arrays.compare(c,d)); // First array is greater than second array because it has an element extra.

        int e[] = {2,4,6,8,1,3,5};
        int f[] = {2,4,6,8,1,3,5,7};
        System.out.println(Arrays.compare(e,f)); // First array is smaller than second array because it has less element.

        int g[] = {2,4,6,8,1,3,5,2};
        int h[] = {2,4,6,8,1,3,5,7};
        System.out.println(Arrays.compare(g,h)); // First array is smaller than second array because at index 7, 2 is smaller than 7.

        int i[] = {2,4,6,8,1,3,5,7};
        int j[] = {1,4,6,8,1,3,5,7};
        System.out.println(Arrays.compare(i,j)); // First array is greater than second array because at index 0, 2 is greater than 1.

    // Note: Compare check the element as well in case of mismatch between two arrays. If first one is greater than it will return 1
        // If second one is greater than it will return -1. If both are equal then it will return 0.
    }
}
