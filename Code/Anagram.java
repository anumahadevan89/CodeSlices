import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
public class Anagram {
	
	public static String sortLetters(String s){
		char[] str1 = s.toCharArray();
		int small,i,j;
		char temp;
		for(i=0;i< str1.length-1; i++){
			small=i;
			for( j=i;j<str1.length;j++){
				if(str1[j]<str1[small])
					small=j;
			}
			temp=str1[small];
			str1[small]=str1[i];
			str1[i]=temp;
			
		}
		return(new String(str1));
	}
	
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string to search anagrams");
		 String[] wordsArray = {"hello", "tac", "cat", "act", "elloh"};  
		   
	      List<String> words1 = Arrays.asList(wordsArray);  
		Hashtable<String, List<String>> anagrams= new Hashtable<String,List<String> > (5);
		for (int i=0;i<words1.size();i++) {
			if(anagrams.containsKey(sortLetters(words1.get(i)))){
				anagrams.get(sortLetters(words1.get(i))).add(words1.get(i));
			}
			else
			{
				List<String> l2=new ArrayList();
				l2.add(words1.get(i));
				anagrams.put(sortLetters(words1.get(i)),l2);
				
			}	
				
		} 
		
		String str=br.readLine();
		
		System.out.println("The anagrams are");
				for (int i=0;i<anagrams.get(sortLetters(str)).size();i++) {		
				System.out.println(anagrams.get(sortLetters(str)).get(i));
				}
				
	}
}
