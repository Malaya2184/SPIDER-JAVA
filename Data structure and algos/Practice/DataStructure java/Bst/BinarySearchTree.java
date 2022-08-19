import java.util.*;
// code and logic bby spider malaya
class Node{
    
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right= null;
    }
    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
    
}

class Bst{
    Node head;
    Bst(){
        this.head= null;
    }
    public void insertNode(int data){
        Node current = this.head;
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            while (current !=null) {
                if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = newNode;
                        break;
                    }
                } else {
                    if (current.left != null) {
                        current=current.left;
                    } else {
                        current.left = newNode;
                        break;
                    }
                    
                }
            }
           
        }
        
    }
    public void printLeftView(){
       
     
    }

    public void printBst(){

    }
    public void printLevel(){
        if (this.head == null) {
            System.out.println("there is no linked list to print");
        } else {
            List li = new ArrayList<>();
            li.add(this.head);
            li.add(null);
            
            while(li.size()>1){
                Node current = (Node) li.get(0);
                if (li.get(1) == null) {
                    System.out.println(current.data);
                    if (current.left != null) {
                        li.add(current.left);
                    }
                    if(current.right != null){
                        li.add(current.right);
                        li.add(null);
                        li.remove(0);
                        li.remove(0);
                    }
                    else{
                        li.add(null);   
                        li.remove(0);
                        li.remove(0);
                    }
                } else {
                    System.out.print(current.data+" ");
                    if (current.left != null) {
                        li.add(current.left);
                    }
                    if(current.right != null){
                        li.add(current.right);
                        li.remove(0);
                    }
                    else{
                        li.remove(0);
                    }
                    
                }
            }
        }
        
    }

    public void calculateHeight(){
        List li = new ArrayList<>();
        int height = 0;
        li.add(this.head);
        li.add(null);
        while (li.size()>1) {
            Node current = (Node) li.get(0);
            if (li.get(1) == null) {
                height ++;
                if (current.left != null) {
                    li.add(current.left);
                }
                if (current.right != null) {
                    li.add(current.right);
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                } else {
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                }
            } else {
                if (current.left != null) {
                    li.add(current.left);
                }
                if (current.right != null) {
                    li.add(current.right);
                    li.remove(0);
                } else {
                    li.remove(0);
                }
            }
            System.out.println(li);
        }
        System.out.println("height of this binary tree is" + height);

    }

    public void findMinValInBst(){
        List li = new ArrayList<>();
        List li2 = new ArrayList<>();

        li.add(this.head);
        li2.add(this.head.data);
        li.add(null);
        
        while(li.size() >1){
            Node current = (Node) li.get(0);
            if (li.get(1) == null) {
                if (current.left != null) {
                    li.add(current.left);
                    li2.add(current.left.data);
                }
                if (current.right !=null) {
                    li.add(current.right);
                    li2.add(current.right.data);
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                }
                else{
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                }
                
            } else {
                if (current.left != null) {
                    li.add(current.left);
                    li2.add(current.left.data);
                }
                if (current.right !=null) {
                    li.add(current.right);
                    li2.add(current.right.data);
                    li.remove(0);
                    
                }
                else{
                    li.remove(0);
                }
            }
            System.out.println(li);
            // System.out.println(li2);

        }
        Collections.sort(li2);
        System.out.println("min is "+ li2.get(0));

    }
    public void sumofKsmallestElement(int k){
        List li = new ArrayList<>();
        List li2 = new ArrayList<>();
        int sum = 0;
        li2.add(this.head.data);
        li.add(this.head);
        li.add(null);

        while (li.size() > 1) {
            Node current = (Node) li.get(0);
            if (li.get(1) == null) {
                if (current.left !=  null) {
                    li.add(current.left);
                    li2.add(current.left.data);
                }
                if (current.right != null) {
                    li.add(current.right);
                    li2.add(current.right.data);
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                } else {
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                }
            } else {
                if (current.left !=  null) {
                    li.add(current.left);
                    li2.add(current.left.data);
                }
                if (current.right != null) {
                    li.add(current.right);
                    li2.add(current.right.data);
                    li.remove(0);
                } else {
                    li.remove(0);
                }
            }
        }
        Collections.sort(li2);
        for (int i = 0; i < k; i++) {
            sum = sum+(Integer)li2.get(i);
        }
        System.out.println("the sum of " + k +"smallest element is" + sum);

    }

    public int calculateHeightOfSubtree(Node head){
        List li = new ArrayList<>();
        li.add(head);
        li.add(null);
        int height = 0;
        while (li.size() > 1) {
            Node current = (Node) li.get(0);
            if (li.get(1) == null) {
                if (current.left != null) {
                    li.add(current.left);
                }
                if (current.right != null) {
                    li.add(current.right);
                    height +=1;
                    li.add(null);
                    li.remove(0);
                    li.remove(0);
                } else {
                    li.add(null);
                    height +=1;
                    li.remove(0);
                    li.remove(0);
                }
            } else {
                if (current.left != null) {
                    li.add(current.left);
                }
                if (current.right != null) {
                    li.add(current.right);
                    li.remove(0);
                } else {
                    
                    li.remove(0);
                }
            }
        }
        return height;
    }

    public void calculateWidthOfBst(){
       
    }
    
    public void findDiameterOfBst(){
        

    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        Bst b = new Bst();
        b.insertNode(6);
        b.insertNode(4);
        b.insertNode(8);
        b.insertNode(3);
        b.insertNode(5);
        b.insertNode(7);
        b.insertNode(10);
        b.insertNode(2);
        b.insertNode(11);
        // System.out.println(b.head.right);
        // b.printLeftView();
        b.printLevel();
        b.findMinValInBst();
        b.calculateHeight();
        b.sumofKsmallestElement(4);
        System.out.println("height of total binary tree  "+ b.calculateHeightOfSubtree(b.head));
        System.out.println("height of left sub tree " + b.calculateHeightOfSubtree(b.head.left));
    }
}
