import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        
        Supplier<String> supplier = ()-> "hi this is spider";
        System.out.println(supplier.get());
    }
}
