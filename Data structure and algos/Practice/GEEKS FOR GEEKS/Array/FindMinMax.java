import java.util.Arrays;

public class FindMinMax {
    public static int[] findMinMax(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    arr[i] = arr[i]*arr[j]/(arr[j]=arr[i]);
                }
            }
        }
        int[] newArr = {arr[0], arr[arr.length-1]};
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,4,5,3,34,23,12,43,21,56};
        System.out.println(Arrays.toString(findMinMax(arr)));
    }
}
