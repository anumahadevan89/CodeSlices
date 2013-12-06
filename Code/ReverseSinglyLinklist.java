package Code;

public class ReverseSinglyLinklist {
	class Node{
		int data;
		Node next;
		Node(int item){
			data=item;
			next=null;
		}
		
	}
	
	Node first;
	public ReverseSinglyLinklist() {
		first=null;
	}
	void insertToList(int item){
		if(first==null)
			first=new Node(item);
		else{
			Node curr=first;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=new Node(item);
		}
	}
	void printList(){
		Node curr=first;
		System.out.println("List");
		while(curr!=null){
			System.out.print(" "+curr.data);
			curr=curr.next;
		}
	}
	
	void reverseList(){
		Node curr=first,prev=null,next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
		}
	
	public static void main(String args[]){
		ReverseSinglyLinklist rv=new ReverseSinglyLinklist();
		
		rv.insertToList(5);
		rv.insertToList(20);
		rv.insertToList(12);
		rv.insertToList(11);
		rv.printList();
		rv.reverseList();
		rv.printList();
	}

}
