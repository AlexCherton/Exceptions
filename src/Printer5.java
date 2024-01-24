import java.util.Arrays;

public class Printer5 {
    public static void main(String[] args) {
        int[] intArray;
        int d = 0;
        if (args.length == 0) {
            intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]);
        }

        if (d==0){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
        }else if (intArray.length<9){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is"+
                    "no 8th element in the given array");
        }else {
        String res = expr(intArray, d);
        System.out.println(res);
    }
    }

    public static String expr(int[] intArray, int d) {

        Float res = 0f;

        String s;

        res = (float)intArray[8]/d;

        s = "intArray[8] / d = " + intArray[8] + " / " + d + " = " + res;

        return s;
        }

}
