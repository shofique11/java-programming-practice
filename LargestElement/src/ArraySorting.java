import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args)
    {
        int[] a = { 5, -2, 23, 7};
        Arrays.sort(a);
        for (int n: a)
        {
            System.out.print(n+ " ");
        }
        System.out.println("\n"+Arrays.toString(a));
        Integer[] aa = { 5, -2, 23, 7};
        Arrays.sort(aa, Collections.reverseOrder());
        System.out.println(Arrays.toString(aa));

    }
}
