package Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindKthSmallestElement {
	
	public static int quicksort(int[] arr,int low,int high) {

		int pivot = low,up=low,down=high,temp;
		while (up<=down) {
			while (arr[up]<arr[pivot])  {
			up++;
			}
			while (arr[down]>arr[pivot]) {
			down--;
			}
			if (up<=down) {
			temp = arr[up];
			arr[up]=arr[down];
			arr[down]=temp;
			up++;
			down--;
			}
		}

		return up;
	}
	
	
		
	
	public static int sort(int[] arr,int low,int high,int k){
		if(low<high){
			int j= quicksort(arr,low,high),ele;
			if(j>k)
				ele=sort(arr,low,j-1,k);
			else if(j<k)
				ele=sort(arr,j+1,high,k);
			else
				return arr[k];
		}
		return arr[k];
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
		int k;
		
		System.out.println("Enter kth position to find");
		k=Integer.parseInt(br.readLine());
		int ele=sort(inp,0,n-1,k-1);
		System.out.println(ele);
	}
}
