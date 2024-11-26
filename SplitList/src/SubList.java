import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List[] split(List<String> list)
    {
        int size = list.size();
        List<String> first = new ArrayList<>(list.subList(0,(size)/2));
        List<String> second = new ArrayList<>(list.subList((size)/2, size));
        return new List[] {first, second};
    }
}
