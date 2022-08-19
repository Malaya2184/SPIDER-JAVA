import java.util.HashMap;

public class SubArraySum {
    public static String findSubArray(int[] arr,int requiredSum){
        // by using hashmap concept
        int sum= 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            hm.put(sum,i);
            if(sum-requiredSum == 0){
                return("starting index is 0 and ending index is "+ i);
            }
            else if(hm.get(sum-requiredSum) != null){
                return("starting index is: "+ (hm.get(sum-requiredSum)+1) + " ending index is : "+ i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={10,15,-5,15,-10,5};
        System.out.println(findSubArray(arr, 20));
        System.out.println(findSubArray(arr, 5));
    }
}
