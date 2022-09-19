
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
}

class Dll{
    Node head;
    Dll(){
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            newNode.prev = current;
            current.next = newNode;
        }
        
    }


    public void printDll(){

        if (this.head == null) {
            System.out.println("this is an empty linked list");
        } else {
            
            Node current = this.head;
            while (current.next != null){
                System.out.print(current.data+ "--->");
                current = current.next;
            }
            System.out.println(current.data+"--->null");
        }
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        Dll dll =  new Dll();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.printDll();
        // cration sucessful for the double linked lst
        // System.out.println(dll.head.next.next.prev);    
    }
}
