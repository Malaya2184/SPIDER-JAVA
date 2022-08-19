import java.util.Arrays;
import java.util.HashMap;

class Solution {
    // using for loop and using hasmap
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        
        return null;
    }
// by using hashmap
    public int[] twoSum2(int[] arr, int target){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int sum = 0;
        int[] result= new int[2];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            hm.put(sum,i);
            if (sum - target == 0){
                result[0] = 0;
                result[1]= i;
                break;
            }else if(hm.get(sum-target)!= null){
                
                result[0]= hm.get(sum-target)+1;
                result[1] = i;
                break;
            }
            
        } 
        
        return result;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(arr, 9)));
        System.out.println(Arrays.toString(s.twoSum2(arr, 9)));
    }
}
