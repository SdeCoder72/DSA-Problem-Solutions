class Solution {
    public Node deepCopy(Node head) {
        Node head2 = new Node(-1);
        Node temp1 = head;
        Node temp2 = head2;
        while(temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }
    public void merge(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        Node t = new Node(-1);
        while(t1 != null) {
            t.next = t1;
            t1 = t1.next;
            t = t.next;

            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }
    }
    public void random(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        while(t1 != null) {
            if(t1.random == null) t2.random = null;
            else t2.random = t1.random.next;
            t1 = t1.next.next;
            if(t2.next != null) t2 = t2.next.next;
        }
    }
    public void split(Node head){
        Node t1 = new Node(-1);
        Node t2 = new Node(-1);
        Node t = head;
        while(t != null) {
            t1.next = t;
            t1 = t;
            t = t.next;

            t2.next = t;
            t2 = t;
            t = t.next;
        }
        t1.next = null;
    }
    public Node copyRandomList(Node head) {
        // deep copy of head
        Node head2 = deepCopy(head);
        // merge 
        merge(head, head2);
        // random connection
        random(head, head2);
        // split
        split(head);
        return head2;
    }
}
