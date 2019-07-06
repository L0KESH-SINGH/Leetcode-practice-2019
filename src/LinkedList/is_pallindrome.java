package LinkedList;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

public class is_pallindrome {
	
	 public static Node inputLL()
		{
			Scanner s = new Scanner(System.in);
			Node list = new Node(0);
			Node list2 = new Node(0);

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
					Node temp = new Node(h);
					list.next = temp;
					list = list.next;
				}
				i++;
				 }
			}
			return list2 ;
		}
	
	public static Node reverseList(Node head , Node ans) {
	        
		 if(head == null)
		 {
			 return ans ;
		 }
		 Node temp = new Node(head.data) ;
		 temp.next = ans ;
		 ans = temp ;
		 return reverseList(head.next, ans) ;
		 
	   }
	
	public static boolean isPalindrome(Node head) 
    {
       Node temp = head ;
       Node ans = null ;
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
		
		Node temp = inputLL() ;
		System.out.println(isPalindrome(temp));

	}

}
