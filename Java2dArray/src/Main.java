import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void print2D(int[][] mat){
         for(int i = 0; i< mat.length; i++) {
             for (int j = 0; j < mat[i].length; j++) {
                 System.out.print(mat[i][j] + " ");
             }
             System.out.println("\n");
         }
    }

    public static void print2D2(int[][] mat)
    {
        for(int[] row: mat)
            for (int colm: row)
                System.out.print(colm + " ");
    }

    public static void print2D3(int[][] mat)
    {
        for(int[] row: mat)
            System.out.println(Arrays.toString(row));
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                {5, 6, 7, 8 },
                {9, 10, 11, 12}
        };
    print2D(mat);
    print2D2(mat);
    print2D3(mat);
    }
}