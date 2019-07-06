package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}

public class flattering_the_linkedlist {
	
	public static void helpflatten ( Node root , ArrayList<Integer> list )
    {
		if(root!=null)
		{
			list.add(root.data) ;
			helpflatten(root.next, list);
			helpflatten(root.bottom, list);
		}
		return ;
    }
	
	public static Node flatten(Node root)
    {
		ArrayList<Integer> list = new ArrayList<>();
		helpflatten(root, list);
		Integer[] arr = new Integer[list.size()]; 
        arr = list.toArray(arr); 
        Arrays.sort(arr);
		Node ans = new Node(arr[0]);
		Node help = ans;
		for(int i=1 ; i < arr.length ; i++)
		{
			Node l = new Node(arr[i]);
			ans.next = l ;
			ans = ans.next ;
		}
		return help ;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Node ab = new Node(5);
		Node bc = new Node(30);
		Node ca = new Node(15);
		Node d = new Node(20) ;
		Node e = new Node(25) ;
		ca.next = d ;
		ca.bottom = e ;
		ab.next = bc ;
		ab.bottom = ca ;
		//helpflatten(ab, list);
		
		Node help = flatten(ab);
		
		
		while(help!=null)
		{
			System.out.print(help.data+" ");
			help = help.next ;
		}

	}

}
