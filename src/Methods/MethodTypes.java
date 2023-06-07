package Methods;


class Methods{

    //no input and no output
    void addition(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("c = "+ c);
    }


    //no input and output
    int subtraction(){
        int a = 30;
        int b = 20;
        int c = a - b;
        return c;
    }


    //input and no output
    void multiplication(int a, int b){
        int c = a*b;
        System.out.println("c = "+c);
    }


    //input and output
    int division(int a,int b){
        int c = a/b;
        return c;
    }
}
public class MethodTypes {
    public static void main(String[] args) {


        Methods type = new Methods();

        type.addition();//no input and no output

        int sub = type.subtraction();//no input and output
        System.out.println(sub);

        type.multiplication(5,2);//input and no output

        int div = type.division(20,10);//input and output
        System.out.println(div);
    }


}
