import java.util.*;

public class UnionInterSection {
    public static HashSet<Integer> findUnion(int[] arr1,int[] arr2){
        HashSet<Integer> hs= new HashSet<Integer>();
        for (Integer i : arr1) {
            hs.add(i);
        }
        for (Integer i : arr2) {
            hs.add(i);
        }
        return hs;
    }

    public static HashSet<Integer> findIntersection(int[] arr1, int[] arr2){
        
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();
        for (Integer i : arr1) {
            hs.add(i);
        }
        for (Integer j : arr2) {
            if(hs.contains(j)){
                intersect.add(j);
            }
        }
        return intersect;
    }

    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {1,2,3,6,7,8};
        System.out.println(findUnion(arr1, arr2));
        System.out.println(findIntersection(arr1, arr2));
    }
}
