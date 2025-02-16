package StreamAPIs;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
       Stream.iterate(0, a -> a+2).limit(100)
               .takeWhile(x -> x <= 100)
               .forEach(System.out::println);
    }
}
