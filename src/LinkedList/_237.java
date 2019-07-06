package LinkedList;

import java.util.Scanner;

public class _237 {
	
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
	
	public static void deleteNode(ListNode node , int x) {
        ListNode temp = node ;
        ListNode prev = null ;
        System.out.println(temp.val);
        if(temp.val == x)
        {
        	node = node.next ;
        	return ;
        }
        while(temp !=null && temp.val != x)
        {
        	prev = temp ; 
        	temp = temp.next ;
        }
        
        prev.next = temp.next ;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = inputLL() ;
		deleteNode(list, 4);
		while(list!=null)
		{
			System.out.print(list.val+" ");
			list=list.next ;
		}
					
	}

}
