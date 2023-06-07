package Arrays;
import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {

    }

    static void twoDJaggedArray(){
        Scanner s= new Scanner(System.in);

        // 2d array Jagged array setup

        int[][] a = new  int[3][];
        a[0] = new int[5];
        a[1] = new int[3];
        a[2] = new int[5];

        //jagged array working with loops and usage of lenght method
        for(int i = 0;i<3;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print("enter row "+ i + " col "+ j +" ");
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Array values");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
