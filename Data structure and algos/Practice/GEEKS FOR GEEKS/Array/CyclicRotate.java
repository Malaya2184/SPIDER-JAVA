import java.util.Arrays;

public class CyclicRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int[] newArr = new int[arr.length];
        newArr[0] = arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newArr[i+1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
