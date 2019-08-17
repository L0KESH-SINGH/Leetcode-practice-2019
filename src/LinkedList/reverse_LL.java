package LinkedList;

import java.util.Scanner;

public class reverse_LL {
	
	 public static ListNode inputLL()
	{
		Scanner s = new Scanner(System.in);
		ListNode list = new ListNode(0);
		ListNode list2 = new ListNode(0);

		int i = 0;
		int h = 0 ;
		while (h != -1) {
			 h = s.nextInt();
			// a++ ;
			 if(h!=-1) {
			if (i == 0) {
				list2 = list;
				list.val = h;
			} else {
				ListNode temp = new ListNode(h);
				list.next = temp;
				list = list.next;
			}
			i++;
			 }
		}
		return list2 ;
	}


	 public static ListNode reverseList(ListNode head , ListNode ans) {
	        
		 if(head == null)
		 {
			 return ans ;
		 }
		 ListNode temp = new ListNode(head.val) ;
		 temp.next = ans ;
		 ans = temp ;
		 return reverseList(head.next, ans) ;
		 
	   }
	 
	 public static ListNode reverseListloop(ListNode head) //better approach
	 {
		 ListNode prev = null ;
		 ListNode curr = head ;
		 while(curr!=null)
		 {
			 ListNode nexttemp = curr.next ;
			 curr.next = prev ; 
			 prev = curr ;
			 curr = nexttemp ;
		 }
		 return prev ;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = inputLL() ;
		ListNode ans = null ;
		//list = reverseList(list, ans) ;
		list = reverseListloop(list);
		while(list!=null)
		{
			System.out.println(list.val);
			list = list.next ;
		}
	}

}
