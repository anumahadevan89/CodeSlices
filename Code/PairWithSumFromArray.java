package Code;

import java.util.HashMap;

public class PairWithSumFromArray {
	public static int arr[]={1,2,3,5,6};
	
	public static boolean isPairPresent(int sum){
		boolean isPresent=false;
		HashMap<Integer,Integer> arrEle=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(arrEle.containsKey(arr[i]))
				arrEle.put(arr[i], arrEle.get(arr[i])+1);
			else
				arrEle.put(arr[i], 1);
		}
		for(int i=0;i<arr.length;i++){
			if(arrEle.containsKey(sum-arr[i])){
				if(arr[i]==sum/2)
					if(arrEle.get(arr[i])==1)
						return false;
				System.out.println("pair :"+arr[i]+(sum-arr[i]));
				return true;
			}
		}
		return isPresent;
	}
	
	public static void sort(){
		int n=arr.length,small,tmp;
		for(int i=0;i<n-1;i++){
			small= i;
			for(int j=i+1;j<n;j++){
				if(arr[small]>arr[j]){
					small=j;
				}
			}
			tmp=arr[small];
			arr[small]=arr[i];
			arr[i]=tmp;
		}
	}
	
	public static void printArray(){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static boolean isPairPresentAfterSorting(int sum){
		sort();
		int i=0,j=arr.length-1;
		while(i<j){
			if(arr[i]+arr[j]<sum){
				i++;
			}
			else if(arr[i]+arr[j]>sum){
				j--;
			}
			else{
				System.out.println(arr[i]);
				System.out.println(arr[j]);
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String args[]){
		boolean isPairPresent=isPairPresent(10);
		System.out.println(isPairPresent);
		isPairPresent=isPairPresentAfterSorting(10);
		System.out.println(isPairPresent);
	}

}
