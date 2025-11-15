package TreeDS.TreeProblems;

public class SymmetricTree {
    public boolean check(Node l, Node r) {
        if(l == null && r == null) return true;
        if(l == null || r == null) return false;
        return (l.data == r.data && check(l.left, r.right) && check(l.right, r.left));
    }
    public boolean isSymmetric(Node root) {
        return check(root.left, root.right);
    }
    public static void main(String[] args) {

    }
}
