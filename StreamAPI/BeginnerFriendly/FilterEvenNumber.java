package StreamAPI.BeginnerFriendly;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {

    public static void main(String[] args) {

        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10,12,14,16,12,3,11,17);

        String result =
                number.stream()
                        .filter(num -> num % 2 == 0)
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "));
                        //.toList();


        // Result way! when used List<String> result instead of String result
//        result.forEach(System.out::print);
//        System.out.println();
//        result.forEach(num-> System.out.print(num + ", "));


    }
}
