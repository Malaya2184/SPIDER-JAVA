import java.util.*;
public class OccuranceOFInteger {
    
    public static HashMap<Integer,Integer> occurance(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i : arr) {
            if(hm.get(i) != null){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        return hm;
        
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,3,4,4,4,3,2,1,5,6,6,6};
        System.out.println(occurance(arr).get(5));
    }
}
