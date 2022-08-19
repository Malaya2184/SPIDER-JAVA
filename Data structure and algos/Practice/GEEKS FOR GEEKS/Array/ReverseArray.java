import java.util.Arrays;

import java.util.Collections;

public class ReverseArray {
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[reverse.length-1-i] = arr[i];
        }
        return reverse;
    }

    public static int[] reverse2(int[] arr){
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse2(arr)));
    }
}
