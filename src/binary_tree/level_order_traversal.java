package binary_tree;
import java.util.*;

public class level_order_traversal {
	
	public void compute(List<List<Integer>> res, TreeNode root, int h){
        if(root == null) return;
        if(h == res.size()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            res.add(level);// create a new level
        }
        res.get(h).add(root.val);// add a value in the h level
        compute(res, root.left, h+1);
        compute(res, root.right, h+1);   
    }
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
        compute(res, root, 0);
        return res;
    }

	public static void main(String[] args) {
		
		

	}

}
