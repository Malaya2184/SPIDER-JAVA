import java.util.*;
class Node{
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

}

class SingleLinkedList{
    Node head;
    SingleLinkedList(){
        this.head = null;
    }
    
    public void insertNode(Object data){
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next=newNode;
            
        }

    
    }
    public void printLinkedlist(){
        if (this.head == null) {
            System.out.println("there is no linkedlist to  print");
        }
        else{
            Node current = this.head;
            while (current.next != null) {
                System.out.print(current.data);
                System.out.print("--->");
                current = current.next;
            }
            System.out.println(current.data+"--->"+"null");
        }
    }
    public void deleteFirstNode(){
        Node current = this.head;
        if (current == null){
            System.out.println("no linkedlist has created yet");
        }
        else{
            this.head= current.next;
        }
    }
    public void deleteLastNode(){
        Node current = this.head;
        Node prev= null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next= null;
    }
    

    public void sortLinkedlist(){
        Node current = this.head;
        List li = new ArrayList<>();
        while (current.next != null){
            li.add(current.data);
            current=current.next;
        }
        li.add(current.data);
        Collections.sort(li);
        this.head = null;
        for (Object o : li) {
            this.insertNode(o);
        }

    }

    public void findMid(){
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        System.out.println("mid node value is "+ slow.data);

    }

    public void findLength(){
        Node current = this.head;
        int size = 0;
        while (current.next !=null) {
            size +=1;
            current= current.next;
        }
        System.out.println("size is "+ (size+1));
    }

    public void searchNode(Object value){
        Node current = this.head;
        int pos = 1;
        while (current.next !=  null) {
            if(current.data == value){
                System.out.println(pos);
                break;
            }
            else{
                current = current.next;
                pos+=1;
            }
           
        }

    }

    public void multiInsert(int[] arr){
        for (int i : arr) {
            this.insertNode(i);
        }
    }

    public void reverseLinkedList(){
        Node current = this.head;
        Node prev=null;
        Node next= null;
        while(current.next != null){
            next = current.next;
            if(current == this.head){
                current.next = null;
                prev = current;
                current = next;
            }
            else{
                current.next = prev;
                prev = current;
                current = next;
            }
            
        }
        current.next = prev;
        this.head = current;
    }
}

public class SingleLL {
    public static void main(String[] args) {
        
        SingleLinkedList s = new SingleLinkedList();
        s.printLinkedlist();
        s.insertNode(5);
        s.printLinkedlist();
        s.insertNode(15);
        s.insertNode(16);
        s.insertNode(17);
        s.printLinkedlist();
        s.deleteFirstNode();
        s.printLinkedlist();
        s.deleteLastNode();
        s.printLinkedlist();
        s.insertNode(3);
        s.insertNode(2);
        s.insertNode(1);
        s.printLinkedlist();
        s.sortLinkedlist();
        s.printLinkedlist();
        s.findMid();
        s.findLength();
        s.searchNode(15);
        int[] arr = {5,7,8};
        s.multiInsert(arr);
        s.printLinkedlist();
        s.reverseLinkedList();
        s.printLinkedlist();
    }    
}
