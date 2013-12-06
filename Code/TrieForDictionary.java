package Code;


public class TrieForDictionary {
	public static final int CHARMAX=26;
	
	class TrieNode{
		char letter;
		TrieNode links[];
		boolean fullWord;
		TrieNode(char c,boolean word){
			letter=c;
			links=new TrieNode[CHARMAX];
			fullWord=word;
		}
	}
	class Trie{
		TrieNode root;
		Trie(){
			root=null;
		}
		void insert(TrieNode curr,char c,boolean isWord){
			if(root==null){
				root=new TrieNode(c,isWord);
				return;
			}
			curr.links[curr.links.length-1]=new TrieNode(c, isWord);
			
		}
		boolean searchNode(TrieNode curr,char c){
			if(root==null){
				return false;
			}
			else{
				for(int i=0;i<curr.links.length;i++){
					if(curr.links[i].letter==c){
						return true;
					}
				}
				return false;
			}
		}
		boolean isWordComplete(TrieNode curr){
			if(curr==null)
				return false;
			return curr.fullWord;
		}
	}
	public static TrieNode createTree(char c, boolean word){
		TrieForDictionary trie=new TrieForDictionary();
		return (trie.new TrieNode('\0',false));
	}
	
	public void insertWord(){
		
	}
	public static void main(String args[]){
		TrieForDictionary td=new TrieForDictionary();
		Trie tr=td.new Trie();
		String str[]={"hello","how","are","you"};
		
	}
}
