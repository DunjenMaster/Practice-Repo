package StreamAPI.BeginnerFriendly;

import java.util.List;
import java.util.stream.Collectors;

public class NamesStartingWithA {
    public static void main(String[] args) {

        List<String> names = List.of("Neelesh", "Utkarsh", "Abhishek", "Alok", "aman");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
