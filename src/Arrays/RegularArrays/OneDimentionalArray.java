package Arrays.RegularArrays;
import java.util.Scanner;
public class OneDimentionalArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //1D array declaration
        int[] a = new int[5];

        //Using with loop
        for(int i = 0;i<5;i++){
            System.out.print("enter index "+ i + " : ");
            a[i] = s.nextInt();
        }
        System.out.println("Array values : ");

        for(int i =0;i<5;i++){

            System.out.print(a[i]+" ");
        }



    }
}
