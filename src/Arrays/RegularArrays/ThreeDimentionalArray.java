package Arrays.RegularArrays;

import java.util.Scanner;

public class ThreeDimentionalArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //three dimentional array declaration

        int[][][] a = new int[3][3][3];

        //Array working with loops
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                for(int k =0;k<3;k++){

                    System.out.print("enter block "+i+" row "+ j + " col "+ k+" : ");
                    a[i][j][k] = s.nextInt();
                }
            }
        }

        System.out.println("Array Values");
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                for(int k =0;k<3;k++){

                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
