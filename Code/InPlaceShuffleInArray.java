package Code;

public class InPlaceShuffleInArray {
	static char arr[]={'a','b','c','1','2','3'};
	static void printArray(){
		System.out.println("Array");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	static void shuffle(char[] arr2,int l,int h){
		int i,j,mid;
		char t;
		int n=h-l+1;
		if(n<4){
			return;
		}
		if(n%4==0){
			mid=n/2;
			for(i=l+n/4;i<mid;i++){
				t=arr2[i];
				arr2[i]=arr2[i+n/4];
				arr2[i+n/4]=t;
			}
			shuffle(arr2,l,h+n/2-1);
			shuffle(arr2,h+n/2,h);
			printArray();
		}
		else if(n%4==2){
			mid=(l+h)/2;
			t=arr[mid];
			for(i=mid;i<h-1;i++){
				arr[i]=arr[i+1];
			}
			arr[i]=t;
			shuffle(arr,l,h-2);
			printArray();
		}
	}
	public static void main(String args[]){
		shuffle(arr,0,5);
		printArray();
	}
}
