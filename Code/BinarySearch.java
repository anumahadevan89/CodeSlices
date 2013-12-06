package Code;
import java.io.*;


public class BinarySearch {

	public static void binarysearch(int[] a, int item){
		int high=a.length,low=0,mid;
		while(low<high){
			mid=(low+high)/2;
			mid=(low+high)/2;
			if(a[mid]>item){
				high=mid-1;
			}
			else if(a[mid]<item){
				low=mid+1;
			}
			else{
				System.out.println("Element found at"+mid);
				return;
			}
		}
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter no of elements");
		n=Integer.parseInt(br.readLine());
		int[] inp= new int[n];
		for(int i=0;i<n;i++){
			inp[i]=Integer.parseInt(br.readLine());
		}
		int item;
		System.out.println("Enter element to search");
		item=Integer.parseInt(br.readLine());
		try{
		binarysearch(inp,item);
		}
		catch(Exception e){
			
		}
	}
}
