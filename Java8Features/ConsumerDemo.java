import java.util.*;
import java.util.function.Consumer;
public class ConsumerDemo {
    public static void main(String[] args) {
        
        Consumer<Integer> consumer = (i)  -> {
            System.out.println("thhis is " + i);};
        consumer.accept(5);

        // for each method accepts the consumer
        List<Integer> myList = Arrays.asList(1,2,3,4,5);
        myList.stream().forEach(consumer);
        System.out.println("-----------------");

        // (i)-> System.out.println(i) this a consumer functional interface implementation to give output but no return type
        // it calls the accept meyhpd internally so we need not to call accept method explecitely
        myList.stream().forEach((i)-> System.out.println(i));
        


    }
}
