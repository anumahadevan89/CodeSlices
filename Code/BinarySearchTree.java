package Code;

public class BinarySearchTree {
	class Node{
		int item;
		Node left,right;
		Node(int data){
			item=data;
		}
	}
	Node root;
	BinarySearchTree(){
		root=null;
	}
	public boolean isEmpty(){
		return root==null;
	}
	
	public int findCommonAncestor(Node curr,Node n1,Node n2){
		if(isEmpty()||n1.item==root.item||n2.item==root.item)
			return -1;
		else{
			if(curr.item>n1.item&&curr.item<n2.item||curr.item<n1.item&&curr.item>n2.item){
				return curr.item;
			}
			else if(curr.item>n1.item&&curr.item>n2.item){
				return findCommonAncestor(curr.left,n1, n2);
			}
			else 
				return findCommonAncestor(curr.right, n1, n2);
		}
	}
	
	
	
	public Node insert(Node curr,int data){

		if(isEmpty()){
			root=new Node(data);
			return root;
		}
		else if(curr==null){
			curr=new Node(data);
			return curr;
		}
		else{
			if(curr.item>data){
				curr.left=insert(curr.left,data);
			}
			else{
				curr.right=insert(curr.right,data);
			}
		}
		return curr;
	}
	public void printTree(Node curr){
		if(curr!=null){
			printTree(curr.left);
			System.out.println(curr.item);
			printTree(curr.right);
		}
	}

	public static void main(String args[]){
		BinarySearchTree btree=new BinarySearchTree();
		btree.insert(btree.root, 8);
		btree.insert(btree.root, 9);
		btree.insert(btree.root, 2);
		btree.insert(btree.root, 4);
		btree.insert(btree.root, 1);
		btree.insert(btree.root, 10);
		btree.printTree(btree.root);
		Node n1=btree.new Node(4);
		Node n2=btree.new Node(9);
		int ancestor=btree.findCommonAncestor(btree.root, n1,n2);
		System.out.println(ancestor);
	}
}
