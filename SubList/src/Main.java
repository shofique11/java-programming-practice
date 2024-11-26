import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(4);
        arrList.add(9);
        arrList.add(25);
        arrList.add(36);
        // Print arrlist
        System.out.println("Original array lsit: "+ arrList);
        // Get sub list
        List<Integer> arrlist2 = arrList.subList(2,4);
        System.out.println("Sub array lsit: "+ arrlist2);
        ArrayList<String> arrString = new ArrayList<String>();
        arrString.add("Shofique");
        arrString.add("Masiur");
        arrString.add("Kamal");
        arrString.add("Jamal Hossen");
        arrString.add("Shain");
        System.out.println("ArrayList of string: "+ arrString);
        List<String> arrList2 = arrString.subList(2,5);
        System.out.println("Sub list: "+ arrList2);

    }
}