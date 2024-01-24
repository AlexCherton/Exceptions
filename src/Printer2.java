import java.util.Arrays;

class Answer2 {
    public int[] subArrays(int[] a, int[] b) {
        int[] difference;
        if (a.length!= b.length) {
            return new int[1] ;
        }

        difference = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            difference[i] = a[i] - b[i];
        }
        return difference;
    }
}
public class Printer2 {
    public static void main(String[] args) {

        int[] a;
        int[] b;
        if (args.length == 0){
            a = new int[] {4, 5, 6};
            b = new int[] {1, 2, 3};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        Answer2 ans = new Answer2();
        String itresume_res = Arrays.toString(ans.subArrays(a,b));
        System.out.println(itresume_res);
    }
}