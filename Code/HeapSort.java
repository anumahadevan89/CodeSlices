import java.io.*;

public class HeapSort {
	
	
	
	public static void heapsort(int[] arr,int n){
		for(int i=n/2;i>1;i--){
			
		}
		
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter no of elements in the array");
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n+1];
		System.out.println("Enter elements");
		for(int i=1;i<=n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		heapsort(arr,n);
		

		
	}
}
