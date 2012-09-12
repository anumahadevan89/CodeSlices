import java.io.*;
public class Union_Find {
	
	public static class Union_FindUF{
	int[] arr;
	int N;
	public Union_FindUF(int no){
		N=no;
		arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=i;
		}
	}
	
	public boolean find(int p,int q){
		return arr[p]==arr[q];
	}

	public void union(int p,int q){
		int pid=arr[p];
		int qid=arr[q];
		for(int i=0;i<N;i++){
			if(arr[i]==pid){
				arr[i]=qid;
			}
		}
	}
	
	public void printarray(){
		for(int i=0;i<N;i++){
			System.out.println(arr[i]);
		}
	}
	}
	public static void main(String args[]){
		Union_FindUF obj=new Union_FindUF(7);
		obj.union(0,1);
		obj.union(2,3);
		obj.union(0,3);
		obj.union(5,6);
		System.out.println(obj.find(0,2));
		obj.printarray();
	}
}
