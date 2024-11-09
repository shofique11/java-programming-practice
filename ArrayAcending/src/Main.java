//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void sortArray(int[] a, int l)
    {
        int temp =0;
        for(int i =0; i <l;i++)
        {
            for(int j = i + 1; j < l; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[] { -5, -9, 8, 12, 1, 3 };
        int l = a.length;
        sortArray(a,l);
        for (int k : a)
        {
            System.out.print(k + " ");
        }
    }
}