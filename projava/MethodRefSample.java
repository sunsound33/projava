package projava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class MethodRefSample {

    public static void main(String[] args) {
        var nums = new int[]{ 2, 5, 3 };
        range(0, 3)
                .map(MethodRefSample::twice)
                .forEach(System.out::println);

        of(nums).mapToObj("*"::repeat).toList();
        var names = List.of("yamamoto", "kis", "sugiyama");
        names.stream().map("%sさん"::formatted).toList();
    }
    static int twice(int x) {
        return x * 2;
    }

}
