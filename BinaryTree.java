import java.util.*;

class Node{
	int key;
	Node left,right;
	Node(int item){
		this.key=item;
		left = right = null;
	}
}
class BinaryTree{
	
	Node root;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	BinaryTree(){
		root = null;
	}
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		root.key = 5;
				
		System.out.println(tree.root.key);
		
		
	}
}