import java.io.*;
import java.sql.Struct;
public class StackOfStringsList {

	private static Node first = null;
	 private static class Node{
		 String item;
		 Node next;
		 
		 
	 }
	 
	 public static boolean isEmpty(){
		 return (first==null);
		 }
	 
		 
	public  static void push (String data){
			 Node oldfirst=first;
			 first = new Node();
			 first.item=data;
			 first.next=oldfirst;
		 }
	
	public static String pop(){
		String item=first.item;
		first=first.next;
		return item;
	}
	 public  static void main(String args[]) throws Exception{
		 String eg= "to be or not to - - - be to be - or not";
		 String arr[]=eg.split(" ");
		 for(int i=0;i<arr.length;i++){
			 if(arr[i].equals("-")){
				 if(!isEmpty()){
				System.out.println(pop());
				 }
			 }
			 else{
				
				 push(arr[i]);
			 }
			 
		 }
	 }
}
