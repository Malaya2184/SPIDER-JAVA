import java.util.HashMap;

class MyMethod{
    public int findTheDistance(String[] arr, String word1, String word2){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == word1) {
                hm.put(word1, i);
            }
            if (arr[i] == word2) {
                hm.put(word2, i);
                break;
            }
        }
        return hm.get(word2)-hm.get(word1);
    }
}

public class ClosestString {
    public static void main(String[] args) {
        String[] arr = {"geeks", "for", "geeks", "contribute", "practice"};
        MyMethod m =  new MyMethod();
        System.out.println(m.findTheDistance(arr, "geeks", "practice"));
    }
}