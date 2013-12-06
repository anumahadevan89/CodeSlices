package Code;

public class QuickSort {
	static int arr[]={4,2,7,8,10};

	public static void printArray(){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}

	public static void swap(int i, int j){
//		arr[i]=arr[i]^arr[j];
//		arr[j]=arr[i]^arr[j];
//		arr[i]=arr[i]^arr[j];
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		           
	}
	public static int quicksort(int low,int high){
		int up=low,down=high+1,pivot=low;
		while(true){
			while(arr[++up]<arr[pivot]){
				if(up==high)break;
			}
			while(arr[--down]>arr[pivot]){
				if(down==low)break;
			}
			if(up>=down)break;
			
			swap(up,down);

		}
		swap(low,down);
		return down;
	}

	public static void sort(int low,int high){
		if(low>=high)return;
		int j=quicksort(low,high);
		sort(low,j-1);
		sort(j+1,high);

	}

	public static void main(String args[]){
		printArray();
		sort(0,4);
		printArray();
	}
}
