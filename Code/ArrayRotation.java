package Code;

public class ArrayRotation {
	public static int arr[]={1, 2 , 3, 4 , 5 };
	public static void printArray(){
		System.out.println();
		for(int i=0;i<5;++i){
			System.out.print(" "+arr[i]);
		}
	}
	public static void reverse(int i, int j){
		int temp;
		for(int k=i,l=j;k<=(j+i)/2;k++,l--){
			temp=arr[k];
			arr[k]=arr[l];
			arr[l]=temp;
		}
	}
	public static void rotateArray(int n, int d){
		if(d==n||d<=0)
			return;
		else{
			reverse(0,d-1);
			reverse(d,n-1);
			reverse(0,n-1);
			
		}
	}
	public static void main(String args[]){
		printArray();
		reverse(0,1);
		printArray();
		reverse(2,4);
		printArray();
		reverse(0,4);
	//	rotateArray(5,2);
		printArray();
	}
}
