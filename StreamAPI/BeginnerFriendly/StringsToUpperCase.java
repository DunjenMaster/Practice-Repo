package StreamAPI.BeginnerFriendly;

import java.util.List;


public class StringsToUpperCase {

    public static void main(String[] args) {


        List<String> str = List.of("Shukla", "v", "Mishra");

        List<String> result =
                str.stream()
                        .map(s -> s.toUpperCase())
                        .toList();

    }
}
