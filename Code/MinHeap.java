package Code;

import java.util.ArrayList;

public class MinHeap {
	
	static int arr[]={1,4,5,2,3,7,8};
	public static void main(String args[]){
	//	ArrayList arr=new ArrayList();
		MinPQ<Integer> q=new MinPQ<Integer>(10);
		q.insert(1);
		q.insert(5);
		q.insert(7);
		q.insert(15);
		q.insert(27);
		q.printArray();
		q.delMin();
		q.printArray();
	//	MinPQ<Integer> integerBox = new MinPQ<Integer>(10);
	}

	public static class MinPQ<Key extends Comparable<Key>>{

		private Key[] pq;
		private int N;

		public MinPQ(int capacity){
			pq= (Key[]) new Comparable[capacity+1];
		//	N=-1;
		}
		
		public void printArray(){
			for(int i=1;i<=N;i++){
				System.out.println(pq[i]);
			}
		}

		public boolean isEmpty(){
			return N==0;
		}

		public boolean greater(int i, int j){
			return pq[i].compareTo(pq[j])>0;
		}

		public void exchange(int i, int j){
			Key temp=pq[i];
			pq[i]=pq[j];
			pq[j]=temp;
		}

		public void swim(int k){
			System.out.println(pq[k]+" "+pq[k/2]);
			while(k>1&&greater(k,k/2)){
				exchange(k,k/2);
				k=k/2;
			}
		}

		public void sink(int k){
			while(2*k<N){
				int j= 2*k;
				while(j<N && greater(j,j+1)){j=j++;}
				if(greater(j,k))
					break;
				exchange(k,j);
				k=j;
			}
		}
		
		public void insert(Key ele){
			N++;
			pq[N]=ele;
			swim(N);
		}
		
		public Key delMin(){
			exchange(1,N);
			Key min=pq[N--];
			sink(1);
			pq[N+1]=null;
			return min;
			
		}
		
		public Key findMin(){
			return pq[N];
		}



	}

}
