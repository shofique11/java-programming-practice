public class RemoveElement {
    public static int removeDuplicates(int[] arr)
    {
        int indx = 1;
        int n = arr.length;
        if(n < 1)
        {
            return n;
        }
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i -1])
            {
                arr[indx++] = arr[i];
            }
        }
        return  indx;
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
