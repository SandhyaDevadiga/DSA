class ReverseLL {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
       ReverseLL list = new ReverseLL();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}




// import java.util.*;

//  public class ReverseLL{
// class Node{
//     int data;
//     Node next;
//     Node(int data, Node next){
//         this.data=data;
//         this.next=next;
//     }
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// };
// public class ReverseLL1(Node head){
//     Node temp=head;
//     Node prev=null;
//     while(temp!=null){
//         Node front=temp.next;
//         temp.next=prev;
//         prev=temp;
//         temp=front;
//     }
//     return prev;
// }
    
//     public static void printLL(Node head){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data + " ");
//             temp=temp.next;
//         }
//          System.out.println();
//     }
   
//      public static void main(String args[]) {
//         Node head=new Node(1);
//         head.next=new Node(3);
//         head.next.next=new Node(2);
//         head.next.next.next=new Node(4);
//         System.out.println("Original LL");
//         printLL(head);
//         head=ReverseLL1(head);
//         System.out.println("AFTER REVERSING");
//          printLL(head);
//      }
//     }

