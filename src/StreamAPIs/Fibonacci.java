package StreamAPIs;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new int[] {0 , 1}, fib -> new int[] {fib[1], fib [0]+ fib [1]}).
                limit(10).
                map(fib-> fib[0]).
                forEach(System.out::println);
    }
}
