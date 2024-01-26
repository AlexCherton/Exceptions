import java.util.Arrays;

public class Printer5 {
    public static void main(String[] args) {
        int[] intArray;
        int d;
        if (args.length == 0) {
            intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            d = 0;
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]);
        }


        Double res = Expr.expr(intArray, d);
        System.out.println(res);

    }

    class Expr {
        public static Double expr(int[] intArray, int d) {

            Double res = 0d;

            if (d == 0) {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
            } else if (intArray.length < 9) {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is" +
                        "no 8th element in the given array");
            } else {
                res = (double) intArray[8] / d;
                System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + res);
            }
            return res;

        }
    }
}
