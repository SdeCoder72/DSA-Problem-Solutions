package TreeDS.TreeProblems;

public class SizeOfBinaryTree {
    public static int getSize(Node node) {
        if(node == null) return 0;
        return (1 + getSize(node.left) + getSize(node.right));
    }
    public static void main(String[] args) {

    }
}
