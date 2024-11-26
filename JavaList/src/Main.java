import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        System.out.println("ArrayList:"+ list.toString());
        List<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        System.out.println("Linklist: "+ list1.toString());
        List<Integer> stack = new Stack<>();
        stack.add(9);
        stack.add(12);
        System.out.println("Stack List: "+ stack.toString());

        List<Integer> list3 = new ArrayList<Integer>(){{
           add(10);
           add(20);
        }};
        System.out.println("Arraylist: "+ list3.toString());

        // creating immutable array in array
        List<Integer> list5 = Arrays.asList(15,25,35);
       // list5.add(45);
        System.out.println("Immutable array: "+ list5.toString());
        List<Integer> list6 = new ArrayList<>(Arrays.asList(11,22,33));
        list6.add(44);
        System.out.println("Mutable array list: "+ list6.toString());

        // create an empty list
        List<Integer> list7 = new ArrayList<>();
        // Instantiating list using Collections.addAll()
        Collections.addAll(list7,13,26,39);
        // Print the list
        System.out.println("Collection list: "+ list7.toString());

        // Use singleton for immutable
        List<Integer> myList = Collections.singletonList(4);
        //Print the list
        System.out.println("Immutable singleton: "+ myList.toString());
    }
}