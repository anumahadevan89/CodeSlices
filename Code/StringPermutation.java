package Code;

public class StringPermutation {
	public static void swap(Integer a,Integer b){
		a=a^b;
		b=a^b;
		a=a^b;
	}
	
	public static char[] arr={'a','c','d'};
	
	public static void permute(char[] a,int i,int n){
		if(i==n){
			System.out.println(a);
			
		}
		else{
			
			for(int j=i;j<=n;j++){
				swap(Integer.parseInt(a[i]),Integer.parseInt(a[j]));
				permute(a,i+1,n);
				swap(a[i],a[j]);
			}
		}
				
	}
	public static void main(String args[]){
		permute(arr,0,2);
	}
}
