package Code;
import java.io.*;
import java.util.HashMap;

public class ArrayDifference {
	
	public static void main(String args[]) throws IOException{
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		System.out.println("Enter no of elements for first array");
		n1=Integer.parseInt(br.readLine());
		int[] a= new int[n1];
		
		for(int i=0;i<n1;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter no of elements for second smaller array");
		n2=Integer.parseInt(br.readLine());
		int[] b= new int[n1];
		
		for(int i=0;i<n2;i++){
			b[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<n2;i++){
			if(!hash.containsKey(b[i])){
				hash.put(b[i], 1);
			}
		}
		
		for(int i=0;i<n1;i++){
			if(!hash.containsKey(a[i])){
				System.out.println(a[i]);
			}
		}
		
	}
}
