import java.util.HashMap;

public class FindTheLonestCommonPrefix {
    public static String find(String[] arr){
        HashMap<Character,Integer> hm = new HashMap<>();
        int smallestLen = 0;
        for (String s : arr) {
            if (smallestLen==0) {
                smallestLen = s.length();
            }
            else if(s.length()<smallestLen){
                smallestLen = s.length();
            }
        }
        System.out.println(smallestLen);
        for (int i = 0; i < smallestLen; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    hm.put(arr[j].charAt(i),1);
                } else {
                    if (hm.get(arr[j].charAt(i)) != null) {
                        continue;
                    }
                    else{
                        if (i==0) {
                            return "-1";
                        }
                        return arr[0].substring(0,i);
                    }
                }
            }
            if (i==smallestLen-1) {
                return arr[0].substring(0,smallestLen);
            }
            System.out.println(hm);
            hm.clear();
        }
        return arr[0];
    }
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek","geezer"};
        // String[] arr1 = {"d","d","d","d"};
        String[] arr1 = {"abcdef", "abcdef", "abcdefg", "ab", "abc"};
        System.out.println(find(arr1));
       
    }
    
}
