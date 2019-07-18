package binary_tree;

public class is_balanced {
	
	public boolean diff = true ;
	
	public int isBalancedhelp(TreeNode root ) {
        if(root==null)
        {
        	return 0 ;
        }
        if(diff==false)
        {
        	return 0 ;
        }
        int left = 0 , right =0 ;
        if(root.left!=null)
        {
        	left++ ;
        	left = isBalancedhelp(root.left)+1;
        }
        if(root.right!=null)
        {
        	right++;
        	right = isBalancedhelp(root.right)+1;
        }
        if(right-left>1 || left-right>1)
        {
        	diff = false ;
        }
        return Math.max(left, right) ;
    }
	
	public boolean isBalanced(TreeNode root) {
        isBalancedhelp(root);
        return diff ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
