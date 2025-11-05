package StackDS;

import java.util.LinkedList;
import java.util.Queue;
class StackWithOneQueue {
    Queue<Integer> q;
    //constructor
    public StackWithOneQueue() {
        q = new LinkedList<>();
    }

    // push
    public void push(int x) {
        q.add(x);
        int n = q.size();
        for(int i = 0; i<n-1; i++) {
            q.add(q.remove());
        }
    }

    // pop
    public int pop() {
        return q.remove();
    }
    // peek
    public int peek() {
        return q.element();
    }
    // empty
    public boolean isEmpty() {
        return q.isEmpty();
    }
    // size
    public int size() {
        return q.size();
    }

//    //display
//    public void display() {
//        Queue<Integer> temp = q;
//        Queue<Integer> store = q;
//        while(!temp.isEmpty()) {
//            System.out.print(temp.remove() + " ");
//        }
//        System.out.println();
//        q = store;
//    }


}

public class ImplementStackUsingOneQueue {
    public static void main(String[] args) {
        StackWithOneQueue s = new StackWithOneQueue();
        s.push(5);
        s.push(6);
        s.push(0);
        s.push(29);
//        s.display(); //ERROR
        s.pop();
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
//        s.display();
    }
}


