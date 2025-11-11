package TreeDS;

import java.util.Scanner;

public class TreeImplementationUsingRecursion {
    public static class Node {
        int data;
        Node left;
        Node right;

        //Constructor
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    private static final Scanner sc = new Scanner(System.in);
    public static Node BinaryTree() {

        int x = sc.nextInt();
        // base case - no node
        if (x == -1) return null;
        Node temp = new Node(x);
        // creates left node
        System.out.print("Enter the left child of " + x + ": ");
        temp.left = BinaryTree();  // Recursive call for left
        //creates right node
        System.out.print("Enter the right child of " + x + ": ");
        temp.right = BinaryTree();  // Recursive call for right
        return temp;

    }

    // Traversal

    public static void preOrder(Node root) {  // N L R
        // base case
        if(root == null) return;
        // print Node
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
        // print
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        System.out.print("Enter the root Node: ");
        Node root = BinaryTree();
        System.out.println(root);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}
