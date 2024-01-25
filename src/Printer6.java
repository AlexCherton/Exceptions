import java.util.Arrays;

class Expr {
    public static Double expr(int a, int b) {
        Double res = 0d;
        if (b==0){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
        }else {
            String s;
            res = (double) a / b;
            printSum(a, b);
        }
        return res;
    }

    public static void printSum(int a, int b) {
        int res = 0;
        String s;
        res = a + b;
        System.out.println(res);
    }
}
public class Printer6 {
    public static void main(String[] args) {
        int a;
        int b;
        if (args.length==0) {
            a = 12;
            b = 0;
        }else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

            Double res = Expr.expr(a, b);
            System.out.println(res);
        }
    }
