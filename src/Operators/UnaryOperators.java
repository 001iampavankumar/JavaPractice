package Operators;

public class UnaryOperators {

    public static void main(String[] args) {
        System.out.println("Increment and decrement");
        incrementAndDecrement();
        System.out.println("Unary plus and minus");
        unaryPLusMinus();
        System.out.println("bitwise complement");
        bitwiseComplement();
        System.out.println("logical Not");
        logicalNot();

    }

    static void incrementAndDecrement(){
        //increment
        int a = 10;
        System.out.println(a);//10
        //post increment
        System.out.println(a++);//10
        //pre increment
        System.out.println(++a);//12

        //decrement
        int b = 10;
        System.out.println(a);//10
        //post decrement
        System.out.println(b--);//10
        //pre decrement
        System.out.println(--b);//9
    }
    static void unaryPLusMinus(){

        int a = 5;
        int b = 6;

        //unary plus
        System.out.println(+a);//5
        //unary minus
        System.out.println(-b);//-6
    }
    static void bitwiseComplement(){
        int a = 5;
        int b = ~a;
        System.out.println(b);//-6
    }
    static void logicalNot(){
        //logical not
        boolean b = true;
        System.out.println(!b);//false
    }
}


