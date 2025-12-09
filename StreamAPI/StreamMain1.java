package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {


        List<Integer> list1 = List.of(2,4,50,21,22,67); // List.Of is immutable
        //list1.add(45); // Throw errors

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(43);
        list2.add(55);

        List<Integer> list3 = Arrays.asList(23,55,35,34,59,60); // asList is also immutable

        // list1 - pick only the even numbers from it and store it in another list
        // without using Stream
        List<Integer> evenList = new ArrayList<>();

        for(Integer num : list1) {
            if(num%2==0) {
                evenList.add(num);
            }
        }
        System.out.println(list1);
        System.out.println(evenList);


        //using Stream API
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(num -> num%2==0).collect(Collectors.toList());
//        System.out.println(newList);

       List<Integer> newList2 = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
       System.out.println(newList2);

       List<Integer> newList3 = list1.stream().filter(num -> num > 10).collect(Collectors.toList());
        System.out.println(newList3);
    }
}
