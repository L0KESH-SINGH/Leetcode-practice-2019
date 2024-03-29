package LinkedList;

import java.util.Scanner;

//import linkedlist.ListNode;

class ListNode {
	      int val;
	     ListNode next;
	      ListNode(int x) { val = x; }
	  }


public class _876 {
	
	public static ListNode inputLL() {
		Scanner s = new Scanner(System.in);
		ListNode list = new ListNode(0);
		ListNode list2 = new ListNode(0);

		int i = 0;
		int h = 0;
		while (h != -1) {

			// a++ ;
			if (h != 0) {
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
			h = s.nextInt();
		}
		return list2;
	}
	
	public static ListNode middleNode(ListNode head) {
        
		ListNode temp = head ;
		ListNode slow = head ;
		while(temp!=null)
		{
			if(temp.next==null)
				return slow ;
			else if(temp.next.next==null)
				return slow.next ;
			temp = temp.next.next ;
			slow = slow.next ;
		}
		return slow ;
    }
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		ListNode list2 = inputLL() ;
		list2 = middleNode(list2) ;
		System.out.println(list2.val);
		
	}
	
}
