import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Shofique");
        list.add("Mohibullah");
        list.add("Wahdud");
        list.add("Kamrul");
        list.add("Ifthekhar");
        list.add("Rakib");
        list.add("Avijit");
        list.add("Shahariar");
        list.add("Shahariar");
        list.add("Kamrul");


        List[] lists = MyList.split(list);
        System.out.println(lists[0]);
        System.out.println(lists[1]);
        List[] lists1 = SubList.split(list);
        System.out.println(lists[0]);
        System.out.println(lists[1]);
        list.subList(1, 3).clear();
        System.out.println("Final List: " + list);
        Collections.sort(list);

        if (!list.isEmpty()) {
            System.out.println("First element is: "
                    + list.get(0));
            System.out.println("Last element is: "
                    + list.get(list.size() - 1));
        }

        List<String> list2 = new ArrayList<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
        System.out.println("Array list: "+ list2);

        String string = String.join(",", list2);
        System.out.println("Comma seprated string: "+ string);
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Shofique");
        list3.add("Wahdud");
        list.retainAll(list3);
        System.out.println("Common element:"+list);

        Set<String> set1 = new HashSet<>(list);
        List<String> list5 = new ArrayList<>(set1);
        System.out.println("Modified ArrayList : "
                + list5);
    }
}