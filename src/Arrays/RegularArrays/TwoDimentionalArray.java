package Arrays.RegularArrays;
import java.util.Scanner;
public class TwoDimentionalArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //two dimentional array declaration

        int[][] a = new int[3][3];

        //Array working with loops
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){

                System.out.print("enter row "+ i + " col "+ j+" : ");
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Array Values");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
