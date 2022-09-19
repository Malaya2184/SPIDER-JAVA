public class LamdaExpression1 {

    public static void main(String[] args) {
        
        FunctionalInterface fi = (x)->x+x;

       System.out.println( fi.add(5));
    }
}


interface FunctionalInterface {

    int add(int x);
    
}