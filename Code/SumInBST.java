package Code;

import java.util.Stack;

public class SumInBST {
	public class Node{
		int data;
		Node left,right;
		Node(int item){
			data=item;
			left=right=null;}
	}


	Node root;
	SumInBST(){
		root=null;
	}

	public Node insert(Node curr,int data){

		if( curr==null){
			curr=new Node(data);
			if(this.root==null){
				root=curr;
			}
			return curr;
		}
		else{
			if(curr.data>data)
				curr.left=insert(curr.left,data);
			else
				curr.right=insert(curr.right,data);
		}
		return curr;


	}

	public boolean hasSubtreeWithSum(Node curr,int sum){
		if(curr==null){
			return sum==0;
		}
		else{
			boolean ans=false;
			//	System.out.println(curr.data);
			int subSum=sum-curr.data;
			if(subSum==0&&curr.left==null&&curr.right==null){
				return true;
			}
			if(curr.left!=null){
				ans=ans||hasSubtreeWithSum(curr.left, subSum);
			}
			if(curr.right!=null){
				ans=ans||hasSubtreeWithSum(curr.right, subSum);
			}
			return ans;
		}

	}

	public int findHeight(Node curr){
		if(curr==null){
			return 0;
		}
		else{
			int lheight=0,rheight=0,height=0;
			if(curr.left!=null){
				lheight=findHeight(curr.left);
			}
			if(curr.right!=null){
				rheight=findHeight(curr.right);
			}
			height=1+((lheight>rheight)?lheight:rheight);
			return height;
		}
	}

	public void printGivenLevel(Node curr, int level){
		if(curr==null){
			return;
		}
		else if(level==1){
			System.out.print(curr.data+"\t");
		}
		else if (level>1){
			printGivenLevel(curr.left,level-1);
			printGivenLevel(curr.right,level-1);
		}
	}

	public void printLevelOrder(Node curr,int level){
		for(int i=1;i<=level;i++){
			printGivenLevel(curr,i);
			System.out.println();
		}
	}
	
	public boolean isBST(Node curr){
		if(curr==null){
			System.out.println("Empty tree");
			return false;
		}
		if(curr.left!=null){
			if(curr.data>curr.left.data)
				isBST(curr.left);
			else 
				return false;
		}
		if(curr.right!=null){
			if(curr.data<curr.right.data)
				isBST(curr.right);
			else
				return false;
		}
		return true;
	}

	public void display(Node curr){
		if(curr!=null){
			display(curr.left);
			System.out.println(curr.data);
			display(curr.right);
		}
	}

	public static void main(String args[]){
		SumInBST bstree=new SumInBST();
		bstree.insert(bstree.root, 8);
		bstree.insert(bstree.root, 23);
		bstree.insert(bstree.root, 34);
		bstree.insert(bstree.root, 4);
		bstree.insert(bstree.root, 8);
		//	bstree.display(bstree.root);
		//	System.out.println(bstree.hasSubtreeWithSum(bstree.root,39));
		int h=bstree.findHeight(bstree.root);
		//	System.out.println(h);
	//	bstree.printLevelOrder(bstree.root,h);
	//	System.out.println(bstree.isBST(bstree.root));


	}

}
