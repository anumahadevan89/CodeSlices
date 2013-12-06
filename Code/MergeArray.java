package Code;

public class MergeArray {
	
	public static char[] arr={'a','b','c','d','e','f','1','2','3','4','5','6'};
	public static void mergeArray(int low,int high){
		int mid=low+(high-low)/2;
		int n=high-low;
		if(n<=2)
			return;
		else if(n==3){
			
		}
		else{
			exchange(low,mid,high);
			mergeArray(low,mid);
			mergeArray(mid,high);
		}
	}
	
	public static void exchange(int low,int mid,int high){
		printArray(low,high);
		System.out.println();
		System.out.println(mid);
		for(int i=low+(mid-low+1)/2,j=mid;i<mid;i++,j++){
			char t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		printArray(low,high);
	}
	
	public static void printArray(int low,int high){
		System.out.println("\nArray is");
		for(int i=low;i<high;i++){
			System.out.print("\t"+arr[i]);
		}
	}
	
	public static void main(String args[]){
		System.out.println(arr.length);
		mergeArray(0,arr.length);
		printArray(0,arr.length);
	}

}
