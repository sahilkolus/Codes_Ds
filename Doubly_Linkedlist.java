
public class Doubly_Linkedlist {
      
    Node head=null, tail = null;  
  
    public void addNode(int data) {  
      
        Node newNode = new Node(data);  
  
       
        if(head == null) {  
       
            head = tail = newNode;  
            
            head.pre = null;  
         
            tail.next = null;  
        }  
        else {  
            
            tail.next = newNode;  
        
            newNode.pre = tail;  
          
            tail = newNode;  
           
            tail.next = null;  
        }  
    }  
    
  
 
    public void display() {  
       
        Node current = head;  
        if(head == null) {  
            System.out.println("There is nothing in the list it is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list are: ");  
        while(current != null) {  
 
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
    	Doubly_Linkedlist List = new Doubly_Linkedlist();  
         
        List.addNode(10);  
        List.addNode(20);  
        List.addNode(30);  
        List.addNode(40);  
        List.addNode(50);  
        List.addNode(60);  
        List.addNode(70);  
        
        List.display();  
    } 
    class Node{  
        int data;  
        Node pre;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
}
