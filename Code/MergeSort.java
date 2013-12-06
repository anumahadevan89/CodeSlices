package Code;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class MergeSort {
	
	static int maxsize=20;
	static int b[]=new int[10];
	static int a[]={8,4,3,1,2};
	public static void merge(int[] a,int low,int mid, int high) {
		int j=mid+1,i=low,k=low;
		while(i<=mid&&j<=high){
			if(a[i]<a[j]){
				b[k++]=a[i++];
			}
			else
				b[k++]=a[j++];
		}
		while(i<=mid){
			b[k++]=a[i++];
		}
		while(j<=high){
			b[k++]=a[j++];
		}
		System.out.println("Inside loop:");
		for(int r=low;r<=high;r++){
		a[r]=b[r];
		}
			
	}
	
	public static void mergesort(int[] a, int low, int high){
		if(low<high){
			int mid=(low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			System.out.println("Inside mergesort");
			for(int r=low;r<=high;r++)
			System.out.print(a[r]);
			merge(a, low,mid, high);
		}
	}
	public static void main(String args[]) throws IOException{
		System.out.println(args[0]);
		FileInputStream file=new FileInputStream(args[0]);
		int i=0;
		int[] a=new int[maxsize];
		while(file.available()==0){
			a[i++]=(char)file.read();
		}
		mergesort(a,0,4);
		for(int i1=0;i1<5;i1++)
		System.out.println(b[i1]);
		
		
	}
	
}
