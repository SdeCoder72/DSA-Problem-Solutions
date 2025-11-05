package StackDS;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
    }

    public int pop(){
        return q1.remove();
    }

    public int top() {
        return q1.element();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
    public int size() {
        return q1.size();
    }

    //Display
//    public void display() {
//        Queue<Integer> temp = q1;
//        while(!temp.isEmpty()) {
//            System.out.print(temp.remove() + " ");
//        }
//    }
}

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(7);
        s.push(8);
        s.push(10);
        s.push(64);
//        s.display();  //ERROR
        System.out.println(s.size());
        s.pop();
        s.top();
//        s.display();
        Queue<Integer> q = new LinkedList<>();

    }
}


