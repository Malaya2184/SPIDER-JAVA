// @FunctionalInterface
interface Method{
    // void m1();

    int add(int val1 , int val2);


}
public class FunctionalInterface {
    public static void main(String[] args) {
        
        //  don't required any implementation class separtely
        // Method method = () -> System.out.println("this is m1 method");
        // method.m1();

        Method method = (int val1, int val2) -> {return val1+val2;};
        System.out.println(method.add(1,2));
    }
}
