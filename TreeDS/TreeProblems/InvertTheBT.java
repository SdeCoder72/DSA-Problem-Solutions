package TreeDS.TreeProblems;

public class InvertTheBT {

    public Node invertTree(Node root) {
        if(root == null) return root;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static void main(String[] args) {
    }
}
