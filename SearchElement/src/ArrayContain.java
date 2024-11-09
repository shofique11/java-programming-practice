import java.util.Arrays;
import java.util.Collections;

public class ArrayContain {
    public static void check(int[] arr, int value)
    {
        boolean test = Arrays.asList(arr)
                .contains(value);

        // Print the result
        System.out.println("Is " + value
                + " present in the array: " + test);
    }
}
