package TreeDS.TreeProblems;

public class SumOfBT {
    static int sumBT(Node root) {
        if(root == null) return 0;
        return (root.data + sumBT(root.left) + sumBT(root.right));
    }
    public static void main(String[] args) {

    }
}
