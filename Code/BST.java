package Code;

public class BST {

	public class Node<T>{
		T item;
		Node<T> left,right;
		Node(T data){
			item=data;
			left=right=null;
		}
	}
	
	
	
	public class bstree<T>{
		Node<T> root;
		bstree(){
			root=null;
		}
		void insert(Node<T> root,T item){
			Node newnode=new Node(item);
			Node curr=root;
			if(root==null){
				root=newnode;
				return;
			}
			if(curr==null){
				curr=newnode;
			}
			else
				if(less(item,(T) curr.item)){
					insert(curr.left,item);
				}
				else 
					insert(curr.right,item);
			  
		}
		
		void inorderrecursive(Node<T> curr){
			while(curr!=null){
				inorderrecursive(curr.left);
				System.out.println(curr.item);
				inorderrecursive(curr.right);
			}
		}
		
		public boolean less(T item1,T item2){
//			if(item1<item2)
//				return true;
			return true;
		}
	}
	
	public static void main(String args){
		
	}
}
