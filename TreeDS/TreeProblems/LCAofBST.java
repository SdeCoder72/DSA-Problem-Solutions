package TreeDS.TreeProblems;

public class LCAofBST {
    public static Node lcaOfBST(Node root, Node p, Node q) {
        if(root==null||p==null||q==null)
            return null;

        while(root!=null){

            if(p.data<root.data && q.data<root.data)
                root = root.left;
            else if(p.data>root.data && q.data>root.data)
                root = root.right;
            else
                return root;
        }

        return null;
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if(p.data < root.data && q.data < root.data){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p.data > root.data && q.data > root.data) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
