package LinkedList;

import java.util.Scanner;

public class _92 {
	
	public static ListNode reverseListloop(ListNode head , int size , ListNode temp) //better approach
	 {
		 ListNode prev = temp.next ;
		 ListNode curr = head ;
		 int count = 1 ;
		 while(curr!=null&&count<=size)
		 {
			 ListNode nexttemp = curr.next ;
			 curr.next = prev ; 
			 prev = curr ;
			 count++;
			 curr = nexttemp ;
		 }
		 return prev ;
	 }
	
    public static  ListNode reverseBetween(ListNode head, int m, int n) {
        
    	ListNode curr = head ;
    	ListNode temp = null ;
    	int count = 1 ;
    	while(count<n)
    	{
    		if(count==m)
    		{
    			temp = curr ;
    		}
    		count++ ;
    		curr = curr.next ;
    	}
    	temp = reverseListloop(temp , n-m+1 ,curr) ; 
    	temp.next = null ;
    	return temp;
    }

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
    
	public static void main(String[] args) {
		
		ListNode list = inputLL();
		list = reverseBetween(list, 2, 4) ;
		while(list!=null)
		{
			System.out.println(list.val);
		}

	}

}
