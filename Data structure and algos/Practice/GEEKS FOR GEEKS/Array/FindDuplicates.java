import java.util.*;

public class FindDuplicates {

    public static ArrayList<Integer> findDup(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i : arr) {
            if (hm.get(i) != null) {
                hm.put(i,hm.get(i)+1);
            } else {
                hm.put(i,1);
            }
        }
        for (int i : hm.keySet()) {
            if (hm.get(i) != 1){
                li.add(i);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,3,2,4,5,6,7,8};
        System.out.println(findDup(arr));
    }
}
