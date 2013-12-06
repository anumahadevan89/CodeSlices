package Code;
//http://www.geeksforgeeks.org/replace-every-element-with-the-greatest-on-right-side/
public class ArrayWithNextMaxInGivenArray {
	public static int[] arr={16, 17, 4, 3, 5, 2};
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void findMaxArray(){
		int large=arr[arr.length-1];
		arr[arr.length-1]=-1;
		for(int i=arr.length-2;i>=0;i--){
			int temp=arr[i];
			
			arr[i]=large;
			if(temp>large){
				large=temp;
			}
		}
		printArray(arr);
	}
	
	public static void main(String args[]){
		findMaxArray();
	}

}
