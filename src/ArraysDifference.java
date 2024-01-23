import java.util.Arrays;

public class ArraysDifference {
    public static void main(String[] args) {

        int[] array1 = {4, 5, 6};
        int[] array2 = {1, 2, 3};
        int[] difference = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            difference[i] = array1[i] - array2[i];

        }
        System.out.println(Arrays.toString(difference));
    }
}