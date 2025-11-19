package TreeDS.TreeProblems;

public class ValidateBST {
    public static boolean validate(Node root, long min, long max) {
        // base case
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        return validate(root.left, min, root.data) && validate(root.right, root.data, max);
    }
    public static boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String[] args) {
    }
}
