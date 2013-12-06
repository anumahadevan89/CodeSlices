package Code;

public class SubStringBoyerMoore {
	public static int findPos(String text,String pat){
		int i,j,skip=0;
		int N=text.length();
		int M=pat.length();
		int right[]=new int[97+26];
		for(int k=97;k<97+26;k++){
			right[k]=-1;
		}
		for(int k=0;k<M;k++){
			right[pat.charAt(k)]=k;
		}
		
		for(i=0;i<N-M;i+=skip){
			skip=0;
			for(j=M-1;j>=0;j--){
			if(!(text.charAt(i+j)==pat.charAt(j))){
				skip= Math.max(1,j-right[text.charAt(i+j)]);
				break;
			}
			}
		if(skip==0) return i;
		}
			
		return N;
	}
	
	public static void main(String args[]){
		String text="hello how are you";
		String pat="this";
		System.out.println(findPos(text,pat));
	}

}
