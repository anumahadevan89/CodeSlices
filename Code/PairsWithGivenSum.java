package Code;

import java.util.ArrayList;
import java.util.HashSet;

public class PairsWithGivenSum {
//	static int arr[]={3,5,7,1,4};
	static int sum=8;
	public static void findpairs(ArrayList<Integer> arr){
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.size();i++){
			
			int x=sum-arr.get(i);
			if(x>0 && hs.contains(x)){
				System.out.println("The elements are "+x+"and"+arr.get(i));
			}
			hs.add(arr.get(i));
		}
	}
	
	public static void main(String args[]){
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(5);
		array.add(1);
		array.add(7);
		array.add(12);
		array.add(3);
		findpairs(array);
	}
}
