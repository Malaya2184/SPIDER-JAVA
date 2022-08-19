public class PeakElement {

    public static int findElement(int[] arr,int num){
        for (int i : arr) {
            if(i == num){
                return 1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,6};
        System.out.println(findElement(arr,4));;
    }
}
