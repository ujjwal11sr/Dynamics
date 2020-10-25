import java.util.Scanner;
public class LinkelEverything{
	Node head;//find its reason
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;;
			next = null;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkelEverything ll = new LinkelEverything();
		
		while(true){
			int inp = sc.nextInt();
			if(inp==1)ll.push(sc.nextInt());
			if(inp==2)ll.append(sc.nextInt());
			if(inp==3)ll.printAll();
			if(inp==4)ll.insertAfter(50,sc.nextInt());
			if(inp==5)ll.delete(sc.nextInt());
			if(inp==6) ll.makeZigZZag(ll.head);
		}
	}
	public  void push(int data){
		Node new_node = new Node(data);
		
			new_node.next = head;
			head = new_node;
			return;
			
			
	}
	public void makeZigZZag(Node head){
		Node traverse = head,prev=null;
		if(head==null){
			return;
		}
		LinkelEverything ll = new LinkelEverything();
		while(traverse.next!=null&&traverse.next.next!=null){
			
			ll.swap(traverse.next.data,traverse.next.next.data);
			traverse = traverse.next.next;
			
		}
	}
	public  void append(int data){
		Node new_node = new Node(data);//here new_node.next = null is also assigned
		if(head == null){
			head = new_node;
			return;
		}
		else{
			Node traverse = head;
			while(traverse.next != null){//traverse.next jab tak null nhi ho rha tab tk traverse karna hai fir last mein assign krna hai
				traverse = traverse.next;
				
			}
			traverse.next = new_node;
			new_node.next = null;
			return;
			
		}
	}
	public  void printAll(){
		Node traverse = head;
		while(traverse!=null){//traverse jab tak null nhi ho rha tab tk print krna hai
			System.out.print(traverse.data+" ");
			traverse = traverse.next;
		}
		System.out.println();
	}
	public void insertAfter(int data,int index){
		Node new_node = new Node(data);
		Node traverse = head;
		int count = 0;
		while(traverse.next!=null){
			if(count==index) {
				
				new_node.next = traverse.next;
				traverse.next = new_node;
				return;
				}
			
			count++;
			traverse = traverse.next;
		}
		
	}
	public void delete(int data){
		Node traverse = head,prev=null;
		if(traverse.data==data){
			head = traverse.next;
			return;
		}
		while(traverse.next!=null){
			if(traverse.data == data){
				break;
				
			}
			prev = traverse;
			traverse = traverse.next;
			
		}
		if(traverse==null) return;
		prev.next = traverse.next;
	}
	public void swap(int a,int b){
		a=a+b;b=a-b;a=a-b;
	}
}
