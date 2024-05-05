class DetectLoop{
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
  
        public static Node Detect(Node head)
        {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                 slow = slow.next;
            fast = fast.next.next;
             
                if(slow==fast){
                    // return true;
                    slow=head;
                    while(slow!=fast){
                    slow = slow.next;  
                    fast = fast.next; 
                    }
                    return slow;
                }
            
            }
            return null;
        
    }
     public static void main(String[] args)
    {
        // //THIS IS FOR DETECTING RHE LOOP
        //  Node head = new Node(1);
        // Node second = new Node(2);
        // Node third = new Node(3);
        // Node fourth = new Node(4);
        // Node fifth = new Node(5);
        // head.next = second;
        // second.next = third;
        // third.next = fourth;
        // fourth.next = fifth;
        // // Create a loop
        // fifth.next = third;

        // // Check if there is a loop
        // // in the linked list
        // if (Detect(head)) {
        //     System.out.println("Loop detected in the linked list.");
        // } else {
        //     System.out.println("No loop detected in the linked list.");
        // }

        //THIS IS FOR FINDING STARTING POINT OF LOOP
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        Node head = node1;

        // Detect the loop in the linked list
        Node loopStartNode = Detect(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }
}