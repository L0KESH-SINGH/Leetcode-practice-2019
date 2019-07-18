package binary_tree;
import java.util.*;

public class level_order_traverse_by_queue {
	
	public  List<List<Integer>> levelOrder(TreeNode root) {
       
		List<List<Integer>> ans = new ArrayList<>() ;
		if(root==null)
		{
			return ans ;
		}
		Queue<TreeNode> q = new LinkedList<>() ; 
        q.add(root);
        
        int h = 1 ;
        
        while(!q.isEmpty())
        {
        	int size=q.size();
        	List<Integer> l = new ArrayList<>();
        	
        	for(int i=0;i<size;i++){	
            	TreeNode temp = q.poll();
            	l.add(temp.val);
            	
            	if(temp.left!=null)
            	{
            		q.add(temp.left);	
            	}
            	
            	if(temp.right!=null)
            	{
            		q.add(temp.right);    
            	}	
        	}
        	if(h%2==0)
        	{
        		List<Integer> p = new ArrayList<>();
        		for(int i=l.size()-1 ; i>=0 ; i--)
        		{
        			p.add(l.get(i));
        		}
        		ans.add(p);
        	}
        	else {
        		ans.add(l);	
        	}
        	
        	h++ ;
        }
        	return ans ;
    }

	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 50 ;
		a ^= b ;
		b ^= a;
		a ^= b;
		System.out.println(a+" "+ b);
		a = a << 1 ;
		System.out.println(a);
		
		// TODO Auto-generated method stub
		//Queue<TreeNode> q = 
	}

}
