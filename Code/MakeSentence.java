package Code;

import java.util.ArrayList;
import java.util.List;

public class MakeSentence {

	public static boolean isValidDictionaryWord(String word){
		if(word.equalsIgnoreCase("he")|| word.equalsIgnoreCase("is"))
			return true;
		return false;
	}
	
	public static boolean makesSentence(String remString,String consideredString,List <String> list)
	{
		int n = remString.length();
        int p = consideredString.length();
		if(n<0)
			return false;
	     boolean b1=false;
		 boolean b2= false;
		 if(isValidDictionaryWord(consideredString))
			{
			 if(n==0)
			 b1 =true;
			 else
			  b1= makesSentence(remString, "", list);
			 if(b1)
				list.add(consideredString);
			}
 	    if(n>0)
 		  b2 = makesSentence(remString.substring(1),consideredString+remString.charAt(0),list);
 	  return b1||b2 ;
	}
	
	public static void main(String args[]) throws Exception{
		List <String> list=new ArrayList <String>();
	//	list.clear();
		
//		String s = "Let’s test";
//		System.out.println(s);
//		s.concat(" if the String object is IMMUTABLE");
//
//		System.out.println(s);
//		System.out.println(s);
//
//		s = s.concat(" if the String object is IMMUTABLE");
//
//		System.out.println(s);
	
		System.out.println(makesSentence("Heist","",list));
	}
}
