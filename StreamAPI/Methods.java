package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {


    public static void main(String[] args) {

        // filter(Predicate)
            // boolean value function based on it filter method will filter it else it will skip it
            // e-> { return true false } or e -> e > 10 return true if true

        // map(Function) this will return value to a new stream.
        /*
        each element operation
        ex- if say we have a list and we want to square each elements present in it
        then map will return it
         */

        //Ex - List to take out the names in a list starts with character "A".
        List<String> names = List.of("Aman", "Ankit", "Abhilash", "Amit", "Rishav", "Deepak", "Aamir");
        List<String> stream1 = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(stream1);

        // Take out the names longer than charter 12 into a new list.
        List<String> names2 = List.of("Pranav Bakliwal", "Manasa Addepalli", "Neenu Joseph", "Karan Dua", "Rahul Kaushik");
        List<String> result1 =
                names2.stream()
                        //.filter(e -> !names2.isEmpty())
                        .filter(e -> e.length()>12)
                        .collect(Collectors.toList());
        System.out.println(result1);
        //result1.forEach(System.out::println);

        //Number greater than 10 in the list along with removal of duplicates and count how many duplicates will be removed
        List<Integer> num = List.of(5,34,6,3,5,3,45,5,67,6,5,435);
        long originalCount = num.size();
        long uniqueCount = num.stream().distinct().count();
        long duplicateRemoved = originalCount - uniqueCount;
        List<Integer> result2 =
                num.stream()
                        .distinct()
                        .filter(e -> e > 10)
                        .toList();

        System.out.println("Final List" + result2);
        System.out.println("Duplicate Removed: " + duplicateRemoved);

        // Even Numbers
        List<Integer> result3 =
                num.stream()
                        .filter(e -> e % 2 == 0)
                        .toList();
        System.out.println(result3);

        // Odd Numbers
        List<Integer> result4 =
                num.stream()
                        .distinct()
                        .filter(e -> e%2 !=0)
                        .toList();
        System.out.println("Odd number from the list" + result4);

        // Names containing letter i in them, using the above list "names"
        List<String> result5 =
                names.stream()
                        .filter(e -> e.contains("i"))
                        .toList();
        System.out.println(result5);

        // Numbers between 10 and 20
        List<Integer> nums = List.of(34,23,15,6,12,35,20);
        List<Integer> result6 =
                nums.stream()
                        .filter(e -> e >= 10 && e <= 20)
                        .toList();
        System.out.println(result6);

        // Names ending with h, using the above list "names"
        List<String> result7 =
                names.stream()
                        .filter(e -> e.endsWith("h"))
                        .toList();
        System.out.println(result7);


        // Ignore the empty strings
        List<String> data = List.of("Java", "", "Python", "", "API");
        List<String> result8 = data.stream().filter(e -> !e.isEmpty()).toList();
        System.out.println(result8);

        List<String> result9 =
                names2.stream()
                        .filter(e -> !e.startsWith("A"))
                        .toList();
        System.out.println(result9);

    }
}
