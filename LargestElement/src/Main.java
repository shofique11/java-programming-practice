import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findLargeElement(int[] arr, int lent)
    {
        int largeElement = arr[0];
        for(int i = 1; i < lent; i++){
            if(arr[i] > largeElement){
                largeElement = arr[i];
            }

        }
        return largeElement;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,3,9,10,56,40,20};
        int lnt = arr.length;
        System.out.println("Largest element: "+findLargeElement(arr, lnt));

        int[] arr1 = {40,60,30,65,35};
        List<Integer> list = new ArrayList<Integer>();
        for (int i =0; i<arr1.length; i++)
        {
            list.add(arr1[i]);
        }
        System.out.println("The largest element: "+ Collections.max(list));

        Student[] student = {new Student(345, "Shofique", "Dhaka"),
        new Student(455, "Fahim", "Gazipur"),
                new Student(234, "Nahid", "Cumilla")};
        Arrays.sort(student, new SortByroll());

        for(int i =0; i< student.length; i++)
        {
            System.out.println(student[i]);
        }
    }
}