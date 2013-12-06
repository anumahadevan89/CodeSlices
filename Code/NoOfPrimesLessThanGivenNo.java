package Code;

import java.util.ArrayList;

public class NoOfPrimesLessThanGivenNo {
	
	
	
	public static int findPrime(int no){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(no==1||no==2)
			return 0;
//		else if( no == 3)
//			return 1;
//		else if(no==4)
//			return 2;
		else{
			int flag=0;
			arr.add(2);
		//	arr.add(3);
			for(int i=3;i<no;i+=2){
				flag=0;
				for(int prime : arr){
					if(i%prime==0){
						flag=1;
						break;
					}
				}
				if(flag==0){
					arr.add(i);
				}
				
			}
//			for(int prime : arr)
//				System.out.println(prime);
			return arr.size();
		}
		
	}
	
	public static void main(String args[]){
		System.out.println(findPrime(2));
		System.out.println(findPrime(3));
		System.out.println(findPrime(12));
		System.out.println(System.currentTimeMillis());
		System.out.println(findPrime(2000000));
		System.out.println(System.currentTimeMillis());
	}
}
