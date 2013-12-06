package Code;

public class ArrayQueue<T extends Comparable<T>> {
	T[] queue;
	int front,rear;
	ArrayQueue(int capacity){
		queue=(T[])new Object[capacity];
	}
	
	public void push(T data){
	//	if(rear==queue.)
		queue[++rear]=data;
	}
	
	public boolean isEmpty(){
		return front>rear;
	}
	
	public T pop(){
		if(isEmpty()){
			System.out.println("Empty Tree");
			return null;
		}
			
		return queue[front--];
		
	}
}
