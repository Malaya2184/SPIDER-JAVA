import java.util.*;


class StacImpl{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    @Override
    public String toString() {
        return "StacImpl [q1=" + q1 + "]";
    }
    public void push(int data){
        q1.add(data);

    }
    public void pop(){
        while (q1.size()>1) {
            q2.add(q1.remove());
        }
        q1.remove();
        Queue<Integer> temp = q1;
        q1=q2;
        q2=temp;
    }

  
 
}
public class StackImplusingQueue {
    public static void main(String[] args) {
        StacImpl st = new StacImpl();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
      
    }
}
