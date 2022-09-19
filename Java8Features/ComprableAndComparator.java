import java.util.*;

public class ComprableAndComparator {
    public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(8);
        myList.add(7);
        myList.add(6);
        myList.add(5);
        Collections.sort(myList, (i,j) -> -i.compareTo(j));
        System.out.println(myList);
    }
}
