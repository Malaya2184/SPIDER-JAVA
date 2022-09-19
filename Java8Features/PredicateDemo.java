import java.util.function.Predicate;
import java.util.*;

public class PredicateDemo {
    public static void main(String[] args) {
        
        Predicate<Integer> predicate = (i) -> {
            if(i%2 == 0){
                return true;
            }
            return false;
        };
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(5));

        System.out.println("---------------------");
        // short hand syntax
        
        Predicate<Integer> predicate2 = i -> i%2==0;
        System.out.println(predicate2.test(4));
        System.out.println(predicate2.test(5));

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        myList.stream().filter((i) -> !(i%2 == 0)).forEach(i -> System.out.println(i));


    }
}
