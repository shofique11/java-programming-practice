import java.util.Arrays;

public class BinarySearch {
    public static void checkValue(int[] arr, int value){
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, value);
        boolean test = res >= 0;
        if(test){
            System.out.println("The element is found in array");
        }else {
            System.out.println("No found in array");
        }
    }
}
