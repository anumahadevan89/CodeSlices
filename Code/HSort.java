package Code;
import java.io.*;

public class HSort {
    int N;
    int arr[];
    
    public HSort(int maxsize){
    	arr=new int[maxsize];
    }
	public  void swap(int i,int j){
	    int t=i;
	    i=j;
	    j=t;
    }
	public  void insert(int k){
	    arr[++N]=k;
	    swim(N);
    }
	
	public  void swim(int k){
	    while(arr[k]>arr[k/2]&&k>1){
	        swap(arr[k],arr[k/2]);
	        k=k/2;
        }
    }

	public  void sink(int k){
		int j;
        while(k<N){
            j=2*k;
            while(j<N && arr[j]<arr[j+1])j++;
            swap(arr[j],arr[k]);
            j=k;
        }
    }
	
	public  void heapsort(int n){
	    while(n!=0){
	    for(int i=n/2;i>1;i--){
			swim(i);

		}
		swap(arr[n],arr[1]);
	    sink(1);
	    }
		
	}
	
	public void printArray(int n){
		for(int i=0;i<n;i++){
			System.out.println(n);
		}
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter no of elements in the array");
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
		HSort h=new HSort(n+1);
		System.out.println("Enter elements");
		for(int i=1;i<=n;i++){
			System.out.println(i);
			h.insert(Integer.parseInt(br.readLine()));
		}
		
		h.heapsort(n);
		h.printArray(n);
	
		
	}
}
