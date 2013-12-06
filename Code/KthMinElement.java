package Code;

public class KthMinElement {
	static int arr[]={4,2,3,8,10};

	public static void printArray(){
		System.out.println();
		for(int i=0;i<5;i++){
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

	public static int findkthmin(int low,int high,int k){
		if(low>=high)return -1;
		int j=quicksort(low,high);
		if(j==k){
			return arr[k];
		}
		else if(j>k){
		return findkthmin(low,j-1,k);
		}
		else
		return findkthmin(j+1,high,k);

	}

	public static void main(String args[]){
		printArray();
		System.out.println("Kth minimum is " +findkthmin(0,4,2));
	}
}
