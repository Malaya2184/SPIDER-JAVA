import java.util.Arrays;

class TwoStacks{
    int[] arr;
    int size,top1,top2;
    TwoStacks(int size){
        arr = new int[size];
        size = size;
        top1 = -1;
        top2 = size;
    }
    void push1(int data){
        if(top1<top2-1){
            top1++;
            arr[top1] = data;
        }
        else{
            System.out.println("stack over flow");
            System.exit(1);
        }
    }
    void push2(int data){
        if(top1<top2-1){
            top2--;
            arr[top2] = data;
        }
        else{
            System.out.println("stack over flow");
            System.exit(1);
        }
    }
    int pop1(){
        if(top1>0){
            int x = arr[top1];
            arr[top1]=0;
            top1--;
            return x;
        }
        else{
            System.out.println("stack underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if(top2<size){
            int x = arr[top2];
            arr[top2] = 0;
            top2++;
            return x;
        }
        else{
            System.out.println("stack under flow");
            System.exit(1);
        }
        return 0;

    }
    @Override
    public String toString() {
        return "TwoStacks [arr=" + Arrays.toString(arr) + "]";
    }
    

}

public class ImplemetTwoStacksInAnArray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(6);
        ts.push1(1);
        ts.push2(6);
        ts.push1(2);
        ts.push2(5);
        ts.pop1();
        System.out.println(ts);
    }
}
