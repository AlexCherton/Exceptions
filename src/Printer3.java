import java.util.Arrays;

class Answer3 {
    public int[] divArrays(int[] a, int[] b) {
        int[] div;
        if (a.length!= b.length) {
            return new int[1] ;
        }

        div = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            div[i] = a[i] / b[i];
        }
        return div;
    }
}
public class Printer3 {
    public static void main(String[] args) {

        int[] a;
        int[] b;
        if (args.length == 0){
            a = new int[] {12, 8, 16};
            b = new int[] {4, 2, 4};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        Answer3 ans = new Answer3();
        String itresume_res = Arrays.toString(ans.divArrays(a,b));
        System.out.println(itresume_res);
    }
}
