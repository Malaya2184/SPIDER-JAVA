public class WrapperClass {
    public static void main(String[] args) {
        // converting primitive data type iinto object is called encapsulation

        int a = 5;
        // System.out.println(a.getClass()); // it willl throw error
        int b = Integer.valueOf(a);
        System.out.println(b);
        Integer c = a; //in baground it will run valueof - called auto boing
        System.out.println(c.intValue());
        System.out.println(c.getClass());

        Integer  x = 5;
        int y = x.intValue();
        System.out.println(y);
        int z = x ;// here auto nboxing works and int value run in baground
        System.out.println(z);
    }
}
