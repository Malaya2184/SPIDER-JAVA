import java.util.concurrent.CompletionException;

class MyExp extends CompletionException {
    public MyExp(String msg){
        super(msg);
    }
}
public class CustomExp {
    public static void main(String[] args) {
        
        throw new MyExp("malya");
    }
}
