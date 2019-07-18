package binary_tree;

public class is_Symmetric {
	
	public static boolean mirror(TreeNode t1 , TreeNode t2)
	{
		if(t1==null && t2 == null)
		{
			return true ;
		}
		if(t1==null || t2==null)
		{
			return false ;
		}
		return (t1.val == t2.val) && mirror(t1.left , t1.right) && mirror(t1.right , t2.left) ;
	}
	
	 public boolean isSymmetric(TreeNode root) {
	     return mirror(root.left , root.right) ;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
