import java.util.*;

class Queue{
    Stack s1 = new Stack<Integer>();
    Stack s2 = new Stack<Integer>();
    public void enqueue(int data){
        s1.push(data);

    }
    public void deque(){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s2.pop();
        while (!s2.empty()) {
            s1.push(s2.pop());  
        }
    }
    @Override
    public String toString() {
        return "Queue [s1=" + s1 + "]";
    }
}

public class QueueImplUsingStck {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q);
        q.deque();
        System.out.println(q);
        
    }
}
