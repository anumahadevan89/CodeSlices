package Code;
import java.io.*;

import Code.BinaryTree.Node;

public class HeapSort {
    static int N;
    final int maxsize= 50;
    static int arr[]={34,45,23,1,5};;
    
    public HeapSort(){
    	
    }
    
    public static void print(){
    	for(int i=0;i<arr.length;i++){
    		System.out.println(arr[i]);
    	}
    }
	public static  void swap(int i,int j){
	    int t=i;
	    i=j;
	    j=t;
    }
	public  void insert(int k){
	    arr[++N]=k;
	    sink(N);
    }
	
	public static  void swim(int k){
	    while(arr[k]>arr[k/2]){
	        swap(arr[k],arr[k/2]);
	        k=k/2;
        }
    }

	public static  void sink(int k){
		int j;
        while(k<N){
            j=2*k;
            if(j<N && arr[j]<arr[j+1])j++;
            if(arr[j]<arr[k])break;
            swap(arr[j],arr[k]);
            j=k;
        }
    }
	
	public static  void heapsort(int[] arr,int n){
	    while(n!=0){
	    for(int i=n/2;i>1;i--){
			swim(i);

		}
		swap(arr[n],arr[1]);
	    sink(1);
	    }
		
	}
	public  static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("Enter no of elements in the array");
//		int n=Integer.parseInt(br.readLine());
//		int[] arr=new int[n+1];
//		System.out.println("Enter elements");
//		for(int i=1;i<=n;i++){
//			arr[i]=Integer.parseInt(br.readLine());
//		}
		heapsort(arr,arr.length-1);
		print();
	
		
	}
}
