import java.util.*;

class Node{
    int data;
    Node next;
    
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubleLL{
    Node head;
    Node tail;
    Node middle;
    int size;
    DoubleLL(){
        this.head = null;
        this.tail = null;
        this.middle = null;
        this.size = 0;
    }

    public void push(int data){

        Node newNode =new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.middle = newNode;
            this.size += 1;
        } else {
            Node current = this.tail;
            current.next = newNode;
            this.size +=1;
            this.tail = current.next;
            this.tail.prev = current;
            if (size%2 != 0) {
                this.middle = middle.next;
            }
            
        }

    }

    public void pop(){
        if (this.head == null) {
            System.out.println("there is no linked list present");
        }
        else{

            Node prevNode = this.tail.prev;
            // System.out.println(prevNode.data);
            prevNode.next = null;
            // System.out.println(prevNode);
            this.tail = prevNode;
            
            this.size -=1;
            if (size%2 == 0) {
                this.middle = this.middle.prev;
            }
        }

    }

    public void print(){
        Node current = this.head;
        while (current.next != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public int findmiddle(){

        return this.middle.data;
        
    }

    public void deleteMiddle(){

    }

}

public class StackWithOperationOnMiddle {
    public static void main(String[] args) {
        DoubleLL st = new DoubleLL();
        st.push(5);
        st.push(52);
        st.push(5);
        st.push(3);
        st.push(4);
        st.print();
        st.pop();
        st.pop();
        st.print();
        System.out.println(st.findmiddle());

    }
}
