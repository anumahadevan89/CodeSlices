package Code;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import Code.BinarySearchTree.Node;

public class BinaryTree {
	class Node{
		int data;
		Node left,right;
		Node(int item){
			data=item;
			left=right=null;
		}
	}

	Node root;

	BinaryTree(){
		root=null;
	}

	public void bfsTraversal(Node curr) throws InterruptedException{
		LinkedBlockingQueue<Node> q=new LinkedBlockingQueue<Node>();
		if(curr==null){
			return;
		}
		else if(curr==root){
			q.put(curr);
			q.put(new Node(-1));
		}
		int level=0;
		while(!q.isEmpty()){
			curr=q.poll();
			if(curr.data==-1){
				q.put(new Node(-1));
				level++;
			}
			else{
				System.out.println(level+":"+curr.data+"\t");
			}
			if(curr.left!=null){
				q.put(curr.left);
			}
			if(curr.right!=null){
				q.put(curr.right);
			}
		}

	}

	public void printTree(Node curr){
		if(curr!=null){
			printTree(curr.left);
			System.out.println(curr.data);
			printTree(curr.right);
		}
	}

	boolean covers(Node root,Node n1){
		if(root==null){
			return false;
		}
		else if(root==n1)
			return true;
		else
			return covers(root.left,n1)||covers(root.right,n1);
	}

	public Node findCommonAncestor(Node curr,Node n1,Node n2){
		if(curr==null)
			return null;
		if(curr==n1) return curr;
		if(curr==n2) return curr;
		boolean is_n1_on_left=covers(curr.left,n1);
		boolean is_n2_on_left=covers(curr.right,n1);

		if(is_n1_on_left!=is_n2_on_left)return curr;

		if(is_n1_on_left) return findCommonAncestor(curr.left, n1, n2);
		else return findCommonAncestor(curr.right, n1, n2);
	}

	public Node findAncestor(Node n1,Node n2){
		if(!covers(root,n1)||!covers(root,n2)){
			return null;
		}
		return findCommonAncestor(root, n1, n2);
	}

	public static void main(String args[]) throws InterruptedException{
		BinaryTree bt=new BinaryTree();
		bt.root=bt.new Node(8);
		bt.root.left=bt.new Node(10);
		bt.root.right=bt.new Node(2);
		bt.root.left.right=bt.new Node(3);
		bt.root.left.left=bt.new Node(9);
		//	bt.printTree(bt.root);
		bt.bfsTraversal(bt.root);
		//	System.out.println(bt.findAncestor(bt.root.left, bt.root.right).data);
	}
}
