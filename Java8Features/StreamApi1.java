import java.util.HashMap;

public class StreamApi1 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1,"malaya");
        hm.put(2,"mal");
        hm.put(3,"mala");
        hm.put(4,"malay");
        hm.put(5,"palaya");

        hm.entrySet().stream().filter((k)-> k.getKey()%2 == 0).forEach(i -> System.out.println(i));
        hm.entrySet().stream().filter((k)-> k.getValue().endsWith("a")).forEach(i -> System.out.println(i));

    }
}
