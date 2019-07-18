package BST;
import javafx.util.*;
import java.util.ArrayList;

import binary_tree.TreeNode;

public class IS_BST {
	
	public static Pair<Boolean, Pair<Integer, Integer>> is_bst(TreeNode root) {
		if (root == null) {
			Pair<Integer, Integer> minmax = new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
			Pair<Boolean, Pair<Integer, Integer>> p = new Pair<Boolean, Pair<Integer, Integer>>(true, minmax);
			return p;
		}
		Pair<Boolean, Pair<Integer, Integer>> lefttree = is_bst(root.left);
		Pair<Boolean, Pair<Integer, Integer>> righttree = is_bst(root.right);

		boolean isBST = true;
		if (lefttree.getKey() == false || (root.val <= lefttree.getValue().getValue())) {
			isBST = false;
		} else if (righttree.getKey() == false || (root.val > righttree.getValue().getKey())) {
			isBST = false;
		}

		int max, min;
		// leftmin = lefttree.getValue().getKey() ;
		max = (Math.max(root.val, Math.max(lefttree.getValue().getKey(), lefttree.getValue().getValue())));
		min = (Math.max(root.val, Math.max(righttree.getValue().getKey(), righttree.getValue().getValue())));
		// rightmax = righttree.getValue().getValue() ;

		Pair<Integer, Integer> minmax = new Pair<Integer, Integer>(min, max);
		Pair<Boolean, Pair<Integer, Integer>> p = new Pair<Boolean, Pair<Integer, Integer>>(isBST, minmax);
		return p;
	}
	
	public static boolean isBST(TreeNode root) {
		Pair<Boolean, Pair<Integer, Integer>> is_bst = is_bst(root);
		return is_bst.getKey() ;
	}

	public static void main(String[] args) {
		
		

	}

}
