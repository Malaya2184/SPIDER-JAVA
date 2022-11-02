
interface Method{
    int add(int x, int y);
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        
        Method m = (int x,int y) -> {return x+y;};
        System.out.println(m.add(5,6)); 
    }    
}
