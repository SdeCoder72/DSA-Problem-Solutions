package QueueDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal_InQueue {
    // Printing the values of queue
    public static void display(Queue<Integer> q){
        for(int i= 0; i<q.size(); i++) {
            System.out.print(q.peek()+ " ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        display(q);
        addAtIndex(q, 60, 3);
        display(q);
        removeAtIndex(q, 2);
        display(q);
        peekAtIndex(q, 4);
        reverse(q);
        display(q);
    }

    // Reversing the queue
    private static void reverse(Queue<Integer> q) {
        // Using stack
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) q.add(st.pop());
        // Using array
        int n = q.size();
        int[] arr = new int[n];
        int i = 0;
        while(!q.isEmpty()) {
            arr[i] = q.remove();
            i++;
        }
        for(i = n-1; i>=0; i--) {
            q.add(arr[i]);
        }
    }

    // Printing value of a particular index
    private static void peekAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if(idx < 0 || idx >= n) {
            System.out.println("Invalid Index");
        }
        else {
            int i;
            for(i = 0; i<idx; i++) {
                q.add(q.remove());
            }
            System.out.println(q.peek());
            for(; i<n; i++) {
                q.add(q.remove());
            }
        }
    }

    // removing element from given index
    private static void removeAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if(idx < 0 || idx >= n) {
            System.out.println("Invalid Index");
        }
        else {
            int i;
            for(i = 0; i<idx; i++) {
                q.add(q.remove());
            }
            q.remove();
            // size reduced
            n = q.size();
            for(; i<n; i++) {
                q.add(q.remove());
            }
        }
    }

    // Adding element at given index
    private static void addAtIndex(Queue<Integer> q, int val, int idx) {
        int n = q.size();
        if(idx < 0 || idx > n) {
            System.out.println("Invalid Index");
        }
        else if(idx == n) {
            q.add(val);
        }
        else {
            int i;
            for(i = 0; i<idx; i++) {
                q.add(q.remove());
            }
            q.add(val);
            for(; i<n; i++) {
                q.add(q.remove());
            }
        }
    }
}
