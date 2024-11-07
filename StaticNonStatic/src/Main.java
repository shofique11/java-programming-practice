import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int m=3;
        int n= 6;
        int s = Helper.sum(m,n);
        System.out.println("sum is = " + s);
        Helper2 helper2 = new Helper2();
        System.out.println("sum is = " + helper2.sum2(m,n));
        StringBuilder stringBuilder = new StringBuilder("java learning");
        System.out.println("String contain = "+ stringBuilder.toString());
        String gfg[] = {"Are","You","a","Programmer"};
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(gfg[0]);
        stringBuilder1.append(" "+gfg[1]);
        stringBuilder1.append(" "+gfg[2]);
        stringBuilder1.append(" "+gfg[3]);
        String str = stringBuilder1.toString();
        System.out.println(
                "Single string generated using toString() method is --> "
                        + str);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Shofique");
        list.add("Shahariar");
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());
    }
}