package TreeDS.TreeProblems;

public class kthSmallestInBST {
    private static int counter = 0;
    private static int result = 0;
    public static void inOrder(Node root, int k) {
        if(root == null) return;
        // left
        inOrder(root.left, k);
        // root level
        counter++;
        if(counter == k){
            result = root.data;
            return;
        }
        // right
        inOrder(root.right, k);

    }
    public static int kthSmallest(Node root, int k) {
        inOrder(root, k);
        return result;
    }
    public static void main(String[] args) {

    }
}
