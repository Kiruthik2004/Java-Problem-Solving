import java.util.*;
class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean isEndOfWord=false;
}
class Trie{
    public static void insert(TrieNode root, String key){
        TrieNode curr=root;
        for(char c:key.toCharArray()){
            int index=c-'a';//to detemine the index using ASCII
            if(curr.children[index]==null){
                curr.children[index]=new TrieNode();
            }
            curr=curr.children[index];//going to the array inside the node
        }
        curr.isEndOfWord=true;
    }
    public static boolean search(TrieNode root,String key){
        TrieNode curr=root;
        for(char c:key.toCharArray()){
            int index=c-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.isEndOfWord;
    }
}
public class Tries
{
	public static void main(String[] args) {
		TrieNode root=new TrieNode();
		Trie.insert(root,"cat");
		Trie.insert(root,"cap");
		Trie.insert(root,"car");
		System.out.println("cat->"+(Trie.search(root,"cat")?"Found":"Notfound"));
		System.out.println("cap->"+(Trie.search(root,"cap")?"Found":"Notfound"));
		System.out.println("car->"+(Trie.search(root,"car")?"Found":"Notfound"));
		System.out.println("can->"+(Trie.search(root,"can")?"Found":"Notfound"));
	}
}
