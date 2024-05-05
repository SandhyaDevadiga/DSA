class RemoveNth {
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
    private static Node DeleteNthNodefromEnd(Node head, int N) {
        Node fast=head;
        Node slow=head;
        for(int i=0; i<N; i++){
            fast=fast.next;
        }
        if(fast==null){
            return head;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        Node deleteNode=slow.next;
        slow.next=slow.next.next;
        deleteNode=null;
        return head;
    }
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}
