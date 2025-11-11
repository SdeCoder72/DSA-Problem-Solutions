package TreeDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeImplementationUsingQueue {
     public static class Node{
        int data;
        Node right;
        Node left;
        //Constructor
        public Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }
    // Traversal
    public static void preOrder(Node root) {  // N L R
        if(root == null) return;
        // print
        System.out.print(root.data + " ");
        // go left
        preOrder(root.left);
        // go right
        preOrder(root.right);
    }
    public static void inOrder(Node root) {  // L N R
        if(root == null) return;
        // go left
        inOrder(root.left);
        // print
        System.out.print(root.data + " ");
        // go right
        inOrder(root.right);
    }
    public static void postOrder(Node root) {  // L R N
        if(root == null) return;
        // go left
        postOrder(root.left);
        // go right
        postOrder(root.right);
        // Node
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data of Root Node: ");
        int x = sc.nextInt();
        Node root = new Node(x);
        Queue<Node> q =  new LinkedList<>();
        q.add(root);

        // Create Tree
        while(!q.isEmpty()) {
            Node temp = q.remove();
            System.out.print("Enter left child Node data of " + temp.data + ": " );
            int left = sc.nextInt();
            if(left != -1) {
                temp.left = new Node(left);
                q.add(temp.left);
            }
            System.out.print("Enter right child Node data of " + temp.data + ": ");
            int right = sc.nextInt();
            if(right != -1) {
                temp.right = new Node(right);
                q.add(temp.right);
            }
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}



/*

               1
           2        3
       4      5   6    7
       8          9
       10

 */
