package Code;

public class RotatedBinarySearch {
	
	static int arr[]={5,6,8,10,14,1,2,3,4};
	public static int search(int low, int high,int searchItem){
		int mid=low+(high-low+1)/2;
		while(low<=high){
			if(searchItem==arr[mid]){
				return mid;
			}
			else if(searchItem>arr[mid]){
				low=mid+1;
			}
			else 
				high=mid-1;
		}
		return -1;
	}
	
	public static int rotatedSearch(int low, int high, int searchItem){
		int mid=low+(high-low+1)/2;
		if(arr[mid]==searchItem){
			return mid;
		}
		else if(arr[mid]<arr[high]){
			if(searchItem>arr[mid] && searchItem<=arr[high]){
				return search(mid+1,high,searchItem);
			}
			else{
				return rotatedSearch(low,mid-1,searchItem);
			}
		}
		else {
			if(searchItem<arr[mid]&&searchItem>=arr[low]){
				return search(low,mid-1,searchItem);
			}
			else{
				return rotatedSearch(mid+1,high,searchItem);
			}
		}
	}
	public static void main(String args[]){
		System.out.println(rotatedSearch(0,8,3));
	}
}
