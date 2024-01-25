import java.util.Arrays;

class Expr {
    public static String expr(int[] intArray, int d) {

        Float res = 0f;

        String s;

        res = (float) intArray[8] / d;

        s = "intArray[8] / d = " + intArray[8] + " / " + d + " = " + res;

        return s;
    }
}
public class Printer6 {
    public static void main(String[] args) {
        int a;
        int b;
        if (args.length==0) {
            a = 99;
            b = 3;
        }else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        if (d==0){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
        }else if (intArray.length<9){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is"+
                    "no 8th element in the given array");
        }else {
            String res = Expr.expr(intArray, d);
            System.out.println(res);
        }
    }



}
