package Code
public  class Trie {
	
	public class TrieNode{
		char letter;
		TrieNode[] links;
		boolean fullWord;
		TrieNode(char l, boolean fullWord){
			letter=l;
			links=new TrieNode[26];
			this.fullWord=fullWord;
		}
	};
	
	public class PrefixTrie{
	public TrieNode CreateTree(){
		return new TrieNode('\0',false);
	}
	
	public void insertWord(TrieNode root,String word){
		int offset=97;
		char[] letters=word.toCharArray();
		int l=word.length();
		TrieNode curr=root;
		for(int i=0;i<l;i++){
			if(curr.links[letters[i]-offset]==null){
				curr.links[letters[i]-offset]=new TrieNode(letters[i],i==l-1?true:false);
			}
			curr=curr.links[letters[i]-offset];
		}
		
	}
	
	public boolean findWord(TrieNode root,String word){
		int offset=97;
		char[] letters=word.toCharArray();
		int l=word.length();
		TrieNode curr=root;
		int i;
		for(i=0;i<l;i++){
			if(curr==null){
				return false;
			}
			curr=curr.links[letters[i]-offset];
		}
		if(i==l&&curr==null){
			return false;
		}
		if(curr!=null&&!curr.fullWord){
			return false;
		
		}
		return true;
		
	}

	public void printTrie(TrieNode root,int level,char[] branch){
		if(root==null)
			return;
		
		for(int i=0;i<root.links.length;i++){
			branch[level]=root.letter;
			printTrie(root.links[i],level+1,branch);
		}
		if(root.fullWord){
			for(int j=1;j<=level;j++){
				System.out.print(branch[j]);
			}
			System.out.println();
			
		}
			
	}
	}
	public static void main(String[] args) {
		Trie t=new Trie();
		PrefixTrie tr=t.new PrefixTrie();
		TrieNode node=tr.CreateTree();
		String[] arr={"hello","this","are","ask","if","what","an","be"};
		for(int i=0;i<arr.length;i++){
			tr.insertWord(node,arr[i]);
		}
		
		char[] branch=new char[50];
		tr.printTrie(node,0,branch);
		String searchWord="this";
		if(tr.findWord(node,searchWord)){
			System.out.println("Word was found");
			
		}
		else{
			System.out.println("Word not found");
		}
	}


}

