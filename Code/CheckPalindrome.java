import java.io.*;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class CheckPalindrome {
	public static void main(String args[]) throws IOException{
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		FileInputStream file=new FileInputStream("inpfile");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(new DataInputStream(file)));
		String str="";
		String strLine="";
		while((strLine=br.readLine())!=null){
			str+=strLine;
		}
		CharBuffer letters=CharBuffer.allocate(file.read());
	//	file.read(letters);
		for(int i=0;i<letters.length();i++){
			System.out.println(letters.get(i));
			if(!hash.containsKey(letters.get(i))){
				hash.put(letters.get(i), 1);
			}
			else{
				hash.put(letters.get(i), (hash.get(letters.get(i))+1));
			}
		}
		Iterator it=hash.entrySet().iterator();
		while (it.hasNext()) {
			
		}
	}
}
