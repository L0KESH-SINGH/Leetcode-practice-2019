package binary_tree;

public class Merge_two_binaryTree {
	
    public void mergeTrees(TreeNode t1, TreeNode t2 , TreeNode ans) {
		
		if(t1== null && t2 ==null)
		{
			return ;
		}
		if(t1==null)
		{
			ans = t2 ;
			return ;
		}
		else if(t2==null)
		{
			ans = t1 ;
			return ;
		}
		else
		{
			int x  = t1.val + t2.val ;
			if(ans == null)
			{
				ans = new TreeNode(x) ;
			}
			else
			{
				ans.val = x ;
			}
			TreeNode left = null ;
			TreeNode right = null ;
			ans.left = left ;
			ans.right = right ;
			mergeTrees(t1.left, t2.left ,ans.left);
	        mergeTrees(t1.right, t2.right , ans.right); 
		}
        
    }
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
		TreeNode ans = null ;
		TreeNode temp = ans ;
		mergeTrees( t1,  t2 , ans) ; 
        return temp ;
    }

	public static void main(String[] args) {
		
		
		
	}

}
