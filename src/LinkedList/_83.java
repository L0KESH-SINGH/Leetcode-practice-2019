package LinkedList;

import java.util.Scanner;

public class _83 {
	
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
	
	public static ListNode removeduplicate(ListNode head) {  
		ListNode temp = head ;
		ListNode next = head ;
		//int i=0 ;
		while(head.next!=null)
		{
			if(head.val == head.next.val)
			{
				//next = temp.next.next ;
				head.next = head.next.next ;
			}
			else
				head = head.next ;
		}
		return temp ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = inputLL() ;
		list = removeduplicate(list);
		while(list!=null)
		{
			System.out.print(list.val+" ");
			list = list.next ;
		}
	}

}
