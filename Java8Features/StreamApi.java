import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        
        List<Integer> li =List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> st = li.stream();
        List<Integer> newLi=st.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newLi);

        List<Integer> newLi2 = li.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newLi2);


        List<String> name = List.of("malya", "madhusmita","mukesh","ramesh");

        name.stream().filter(e->e.startsWith("m")).forEach(e->{
            System.out.println(e);
        });

        List<Integer> arr = List.of(12,14,54,1,3,2,6,5,4,87,98);
        List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
        Integer num = arr.stream().min((x,y)->-x.compareTo(y)).get();

        List<Integer> sqr = arr.stream().filter(e->e>10).map(e->e*e).collect(Collectors.toList());
        System.out.println("sqr"+sqr);

        System.out.println(num);
        System.out.println(sorted);
        
        int[] arr1 = {12,14,54,1,3,2,6,5,4,87,98};
        System.out.println(Arrays.toString(arr1));


    }
}
