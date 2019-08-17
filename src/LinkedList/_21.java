package LinkedList;

import java.util.Scanner;

import com.sun.scenario.effect.Merge;

public class _21 {
	
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
public static ListNode mergeTwoLists(ListNode l1 , ListNode l2) {
	 if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
// public static ListNode mergeTwoLists(ListNode l1, ListNode l2 , ListNode ans , ListNode curr) {
//       
//	 if(l1 == null)
//	 {
//		 if(curr == null)
//		 {
//			 return l2 ;
//		 }
//		 curr.next = l2 ;
//		 return ans ;
//	 }
//	 else if(l2 == null)
//	 {
//		 if(curr == null)
//		 {
//			 return l1 ;
//		 }
//		 curr.next = l1 ;
//		 return ans ;
//	 }
//	 
//	 if(l1.val <= l2.val)
//	 {
//		 if(curr == null)
//		 {
//			 ListNode temp = new ListNode(l1.val) ;
//			 curr = temp ;
//			 ans = temp ;
//			 l1 = l1.next ;
//		 }
//		 else {
//		 ListNode temp = new ListNode(l1.val) ;
//		 curr.next = temp ;
//		 curr = temp ;
//		 l1 = l1.next ;
//		 }
//	 }
//	 else
//	 {
//		 if(curr == null)
//		 {
//			 ListNode temp = new ListNode(l2.val) ;
//			 curr = temp ;
//			 ans = temp ;
//			 l2 = l2.next ;
//		 }
//		 else {
//		 ListNode temp = new ListNode(l2.val) ;
//		 curr.next = temp ;
//		 curr = temp ;
//		 l2 = l2.next ;}
//	 }
//	 return mergeTwoLists(l1, l2, ans, curr) ;
//    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = inputLL() ;
		ListNode l2 = inputLL() ;
//		ListNode ans = null ;
//		ListNode curr = ans ;
		l1 = mergeTwoLists(l1, l2) ;
		while(l1!=null)
		{
			System.out.println(l1.val);
			l1 = l1.next ;
		}
	}

}
