package Code;

public class MergeArray2 {
	
	public static char[] arr={'a','b','c','d','e','f','1','2','3','4','5','6'};
	public static void mergeArray(int low,int high){
		int mid=low+(high-low+1)/2;
		int n=high-low;
	//	System.out.println(n);
		if(n<=1)
			return;
		System.out.println();
		System.out.println(mid);
		exchange(low,mid);
		mergeArray(low,mid);
		mergeArray(mid,high);
	}
	
	public static void exchange(int low,int mid){
		printArray(low,mid);
		for(int i=low+(mid-low+1)/2,j=mid;i<mid;i++,j++){
			char t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		printArray(low,mid);
	}
	
	public static void printArray(int low,int high){
		System.out.println();
		System.out.println("Array is");
		for(int i=low;i<high;i++){
			System.out.print("\t"+arr[i]);
		}
	}
	
	public static void main(String args[]){
		mergeArray(0,arr.length);
		printArray(0,arr.length);
	}

}
