package Code;

public class IsStringRotated {
	
	public static void printArray(int arr[]){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
	public static boolean isRotated(String str1,String str2){
		if(str1.length()==str2.length()){
			String concatstr=str1+str1;
			if(isSubstring(concatstr, str2))
				return true;
		}
		return false;
		
	}
	
	public static int max(int i,int j){
		return (i>j)?i:j;
	}
	
	public static boolean isSubstring(String str1,String str2){
		int n=str1.length();
		int m=str2.length();
		int right[]=new int[256];
		for(int i=0;i<256;i++){
			right[i]=-1;
		}
		for(int i=0;i<m;i++){
			right[str2.charAt(i)]=i;
			
		}
		int skip;
		for(int i=0;i<n-m;i+=skip){
			skip=0;
			for(int j=m-1;j>0;j--){
				if(!(str1.charAt(i+j)==str2.charAt(j))){
					skip=max(1,j-right[str1.charAt(i+j)]);
					break;
				}
				
			}
			if(skip==0){return true;}
				
			}
		return false;
		}
			
	
	public static void main(String args[]){
		String str1="hello";
		String str2="llohe";
		System.out.println(isSubstring("hello this is it", "this"));
		System.out.println(isRotated(str1,str2));
	}
}
