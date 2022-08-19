import java.util.*;
import java.util.Arrays;

class Method{
    public int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    arr[i] = (arr[i]* arr[j])/(arr[j]=arr[i]);
                }
            }
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr){

        boolean sorted = false;
        while (sorted != true) {
            sorted = true;
             for (int i = 0; i < arr.length-1; i++) {
                if (arr[i+1]<arr[i]) {
                    arr[i+1] = arr[i+1]*arr[i]/(arr[i]=arr[i+1]);
                    sorted = false;
                }
             }
        }

        return arr;
    }
/// lil error is there 
    public int[] mergeSort(int[] arr){
        int[] arr1;
        int[] arr2;
        if (arr.length == 1) {
            return arr;
        } else {
            if (arr.length % 2 == 0) {
                arr1 = new int[arr.length/2];
                arr2 = new int[arr.length/2];
            }
            else{
                arr1 = new int[arr.length/2];
                arr2 = new int[(arr.length/2) +1];
            }
            for (int i = 0; i < arr.length/2; i++) {
                arr1[i] = arr[i];
            }
            for (int i = (arr.length)/2; i < arr.length; i++) {
                arr2[i-(arr.length)/2] = arr[i];
            }

            // System.out.println(Arrays.toString(arr1));
            // System.out.println(Arrays.toString(arr2));
            arr1 = this.mergeSort(arr1);
            arr2 = this.mergeSort(arr2);
        }
        int[] sorted = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println(sorted.length);

        

        

        return sorted;
    }
}

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {1,1,256,54,32,12,56,64};
        int[] arr2 = {1,1,256,54,32,12,56,64};
        int[] arr3 = {1,1,256,54,32,12,56,64};
        Method m = new Method();
        System.out.println(Arrays.toString(m.selectionSort(arr)));
        System.out.println(Arrays.toString(m.bubbleSort(arr2)));
        System.out.println(Arrays.toString(m.mergeSort(arr3)));;
    }
}
