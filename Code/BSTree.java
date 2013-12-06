package Code;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BSTree {

	public class Node{
		int data;
		Node left,right;

		public Node(int item){
			data=item;
			left=right=null;
		}
	}

	Node root;
	public BSTree(){
		root=null;
	}

	public Node insert(Node root,int data){

		if(root==null){
			root=new Node(data);
			if(this.root==null){
				this.root=root;
			}
			return root;
		}
		else{
			if(data<root.data){
				root.left=insert(root.left,data);
			}
			else{
				root.right=insert(root.right,data);
			}
		}
		return root;
	}

	public void printInorder(Node root){
		if(root!=null){
			printInorder(root.left);
			System.out.println(root.data);
			printInorder(root.right);
		}
	}
	
	public void printPreorder(Node curr){
		if(curr!=null){
			System.out.println(curr.data);
			printPreorder(curr.left);
			printPreorder(curr.right);
		}
	}

	public static int max(int a, int b){
		if(a>b)
			return a;
		return b;
	}
	
	public static int height(Node curr){
		int height=0;
		if(curr==null){
			return 0;
		}
		height=1+max(height(curr.left),height(curr.right));
		return height;
	}
	
	public void BFSTraversal(Node curr) throws InterruptedException{
		LinkedBlockingQueue<Node> q=new LinkedBlockingQueue<Node>();
		if(this.root==null){
			return;
		}
		else if(curr==this.root){
			q.put(curr);
		}

		while(!q.isEmpty()){
				
				curr=q.poll();
				System.out.print(curr.data+"\t");
				if(curr.left!=null){
					q.put(curr.left);
				}
				if(curr.right!=null){
					q.put(curr.right);
				}
				
			}

		System.out.println();
	}
	
	public void dfs(){
		Stack<Node> st=new Stack<Node>();
		st.add(root);
		Node curr=root;
		while(curr!=null){
			curr=st.peek();
		//	System.out.println(curr.data);
			if(curr.left==null&&curr.right==null){
				break;
			}
			if(curr.left!=null)
				st.add(curr.left);
			if(curr.right!=null)
				st.add(curr.right);
			
		}
		popAndPrintStack(st);
	}

	public void printPreorderIterative(Node root){
		if(root==null){
			System.out.println("Empty Tree");
			return;
		}
		Stack<Node> st=new Stack<Node>();
		st.add(root);
		Node curr=null;
		while(!st.isEmpty()){
			curr=st.pop();
			System.out.println(curr.data);
			if(curr.right!=null){
				st.push(curr.right);
			}
			if(curr.left!=null){
				st.push(curr.left);
			}
				
			
		}
	}
	
	public void printInorderIterative(Node root){
		if(root==null){
			System.out.println("Empty Tree");
			return;
		}
		Stack<Node> st=new Stack<Node>();
		st.add(root);
		Node curr=root;
		while(!st.isEmpty()){
			while(curr.left!=null){
				st.push(curr.left);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.println(curr.data);
			if(curr.right!=null){
				st.push(curr.right);
	
				
			}
		}
	}
	
	public void printPostorderIterative(Node root){
		if(root==null){
			System.out.println("Empty Tree");
			return;
		}
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		s1.add(root);
		Node curr=null;
		while(!s1.isEmpty()){
			curr=s1.pop();
			s2.add(curr);
			if(curr.left!=null){
				s1.add(curr.left);
			}
			if(curr.right!=null){
				s1.add(curr.right);
			}
		}
		popAndPrintStack(s2);
	}
	
	public void popAndPrintStack(Stack<Node> s){
		while(!s.isEmpty()){
			System.out.println(s.pop().data);
		}
	}

	public static void main(String args[]) throws Exception{
		BSTree bst=new BSTree();
		bst.insert(bst.root, 5);
		bst.insert(bst.root, 8);
		bst.insert(bst.root, 28);
		bst.insert(bst.root, 3);
		bst.insert(bst.root, 6);
		bst.insert(bst.root, 34);
		System.out.println("Height"+height(bst.root));
	//	bst.printInorder(bst.root);
		bst.BFSTraversal(bst.root);
	//	bst.dfs();
	//	bst.printPreorder(bst.root);
	//	bst.printPostorderIterative(bst.root);
	//	bst.printPreorderIterative(bst.root);
	}



}
