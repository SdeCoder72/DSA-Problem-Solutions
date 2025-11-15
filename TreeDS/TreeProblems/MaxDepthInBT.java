package TreeDS.TreeProblems;

public class MaxDepthInBT {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {

    }
}
