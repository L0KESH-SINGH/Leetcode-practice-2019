package LinkedList;

import java.util.Scanner;

class Node2
{
	int data;
	Node2 next;
	
	Node2(int d)
	{
		data = d;
		next = null;
	}
}

public class is_pallindrome {
	
	 public static Node2 inputLL()
		{
			Scanner s = new Scanner(System.in);
			Node2 list = new Node2(0);
			Node2 list2 = new Node2(0);

			int i = 0;
			int h = 0 ;
			while (h != -1) {
				 h = s.nextInt();
				// a++ ;
				 if(h!=-1) {
				if (i == 0) {
					list2 = list;
					list.data = h;
				} else {
					Node2 temp = new Node2(h);
					list.next = temp;
					list = list.next;
				}
				i++;
				 }
			}
			return list2 ;
		}
	
	public static Node2 reverseList(Node2 head , Node2 ans) {
	        
		 if(head == null)
		 {
			 return ans ;
		 }
		 Node2 temp = new Node2(head.data) ;
		 temp.next = ans ;
		 ans = temp ;
		 return reverseList(head.next, ans) ;
		 
	   }
	
	public static boolean isPalindrome(Node2 head) 
    {
       Node2 temp = head ;
       Node2 ans = null ;
       ans = reverseList(temp, ans);
       temp = head ;
       while(temp!=null && ans!=null)
       {
    	   if(temp.data != ans.data)
    	   {
    		   return false ;
    	   }
    	   temp = temp.next ;
    	   ans=ans.next ;
       }
       return true ;
    } 

	public static void main(String[] args) {
		
		Node2 temp = inputLL() ;
		System.out.println(isPalindrome(temp));

	}

}
