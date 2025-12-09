package StreamAPI;

import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        //Stream API - Process Collection / Group of objects
        // Stream is an interface hence object cannot be created.

        // 5 ways to get Objects with Stream.

        //1 Empty Stream
        Stream<Object> emptyStream = Stream.empty();

        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        // 2 - array, object, colection; Stream of String
        String names[] = {"Riya", "Utkarsh", "Neelesh", "Tabby"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //S
        Stream<Object> streamBuilder = Stream.builder().build();

    }
}
