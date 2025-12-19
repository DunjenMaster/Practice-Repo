package StreamAPI.BeginnerFriendly;


import java.util.List;
import java.util.stream.*;

// Increment each element of a list by 1 using streams.

public class IncrementElementBy1 {

    public static void main(String[] args) {


        List<Integer> list1 = List.of(2,4,6,8,12);

        List<Integer> result =
            list1.stream()
                    .map(n -> n+1)
                    .toList();

    }

}
