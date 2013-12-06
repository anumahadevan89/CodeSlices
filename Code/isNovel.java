package Code;

import java.util.HashSet;



public class isNovel {
	
	 static int isNovel(String str) {
		 	
	        int length=str.length();
	        HashSet<String> hashobj=new HashSet<String>();
	        StringBuilder input=new StringBuilder();
	        int begin, end;
	        String c="";
	        
	        for(int k=0;k<length;k++){
	            hashobj.clear();
	            for(int i=0;i<length;i++){
	                begin=i;
	                end=i+k+1;
	                if(end<length){
	                    input.append(str.charAt(begin));
	                    input.append(str.charAt(end));
	                    c=input.toString();
	                    input.setLength(0);
	                    if(!hashobj.contains(c)){
	                        hashobj.add(c);
	                    }
	                    else{
	                        return 0;
	                    }
	                }
	            }
	        }
	        return 1;
	    }
	 
	 public static void main(String args[]){
		 System.out.println(isNovel("ORDINARY"));
		 System.out.println(isNovel("FFLL"));
	 }
}
//	 static boolean isNovel(String str) {
//	        int length=str.length();
//	        HashTable<String,Integer> hashobj=new HashTable<String,Integer>();
//	        char arr[]=str.toCharArray();
//	        int k=1;
//	        while(k<length){
//	            for(int i=0;i<length;i=i+2*k){
//	                String subval=arr[i]+arr[i+k];
//	                if(hashobj.hasKey(subval)){
//	                    return false;
//	                }
//	                else{
//	                    hashobj.put(subval, "1");
//	                }
//	            }
//	            
//	        
//
//	    }
//}
