package TreeDS.TreeProblems;
import java.util.*;
public class LevelOrderTraversal {
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node temp;
        ArrayList<Integer> a;
        while(!q.isEmpty()){
            temp = q.remove();
            a = new ArrayList<>();
            a.add(temp.data);
            ans.add(a);
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

//        ArrayList<ArrayList<Integer>> ans = levelOrder(/*TreeNode*/);
    }
}
