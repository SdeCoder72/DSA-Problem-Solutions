// using stack A.S-O(n)
public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp != null) {
            while(!st.isEmpty() && st.peek().val < temp.val) st.pop();
            st.push(temp);
            temp = temp.next;
        }
        while(!st.isEmpty()){
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
}

// No extra space 
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode c = head;
        ListNode p = null;
        ListNode f = null;
        while(c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode i = head;
        ListNode j = head.next;
        while(j != null) {
            if(j.val >= i.val) {
                i.next = j;
                i = j;
            }
            j = j.next;
        }
        i.next = null;
        return reverse(head);
    }
}
