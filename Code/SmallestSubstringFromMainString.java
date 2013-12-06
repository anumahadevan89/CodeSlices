package Code;
import java.util.HashMap;

public class SmallestSubstringFromMainString {

	public static String findSmallestString(String mainString){
		String str1 = "";
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		char[] mainStr=mainString.toCharArray();
		for( char ele : mainStr){
			if(!hash.containsKey(ele)){
				hash.put(ele, 1);
				str1+=ele;
			}
		}
		return str1;
	}

	public static void main(String[] args){
		System.out.println(findSmallestString("seriously"));
		
	}
}
