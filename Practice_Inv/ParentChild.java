public class ParentChild {
    public static void main(String[] args) {
        
        Parent ch = new Child();
        System.out.println(ch.getClass());
    }
}

abstract class Parent{
    abstract void override();
}
class Child extends Parent{
    void override(){
        System.out.println("over rided");
    }
}
