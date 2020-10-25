
import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class GFG2
{
  //  Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
     /* Drier program to test above functions */
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
			GFG2 llist=new GFG2();
            GFG obj = new GFG();
            Node head=null;
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                if(a2==0)
                    head=obj.insertAtBeginning(head,a1);
                else
                    head=obj.insertAtEnd(head,a1);
            }
			llist.printList(head);
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class GFG
{
// function inserts the data in front of the list and returns the head of LL.
	Node insertAtBeginning(Node head1,int a1)
	{
	    Node new_node = new Node(a1);
	    new_node.next = head1;
	    head1 = new_node;
	    return head1;
			
	}
// function appends the data at the end of the list and returns the head of LL.
	Node insertAtEnd(Node head1,int a1)
	{
	    Node new_node = new Node(a1);
	    Node traverse = head1;
		if(head1==null){
		    head1=new_node;
		    return head1;
		}
		while(traverse.next!=null){
		    traverse=traverse.next;
		}
		traverse.next = new_node;
		return head1;
		
	    
	}
}