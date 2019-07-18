package binary_tree;

public class diameter_of_binary_Tree {
	
	static int max = 0 ; 
	static int sum = 0 ;
	public void diameterOfBinaryTreehelp(TreeNode root) 
	{
        if(root==null)
        {
        	if(sum>max)
        	{
        		max = sum ;
        	}
        	sum = 0 ;
        	return ;
        }
        sum++ ;
        diameterOfBinaryTreehelp(root.left);
        diameterOfBinaryTreehelp(root.right);
    }
	
	public int diameterOfBinaryTree(TreeNode root) 
	{
        diameterOfBinaryTreehelp(root);
        return max ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
