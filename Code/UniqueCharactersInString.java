package Code;

public class UniqueCharactersInString {
	static String str="elephant";
	public static void main(String args[]){
		boolean ch[]=new boolean[256];
		for (int i=0;i<str.length();i++){
			if(!ch[str.charAt(i)])
				System.out.println(str.charAt(i));
				ch[str.charAt(i)]=true;
			
		}
		
	}
	
}
