package com.leetcode;

class Trie {
    
    
	   TrieNode root;
	    /** Initialize your data structure here. */
	    public Trie() {
	        root = new TrieNode();
	    }
	    
	    /** Inserts a word into the trie. */
	   public void insert(String word) {
	        TrieNode current = root;
	        for(int i=0; i< word.length(); i++){
	            char ch = word.charAt(i);
	            TrieNode node = current.children[ch - 'a'];
	            if(node == null){
	                node = new TrieNode();
	                node.val = ch;
	                current.children[ch - 'a'] = node;
	                
	            }
	            current = node;
	        }
	        current.endNode = true;
	    }
	    
	    /** Returns if the word is in the trie. */
	     public boolean search(String word) {
	        TrieNode current = root;
	        
	        for(int i=0; i<word.length(); i++){
	            char ch = word.charAt(i);
	            TrieNode node = current.children[ch-'a'];
	            if(node!=null){
	                current = node;
	            }
	            else{
	                return false;
	            }
	        }
	        
	        return current.endNode;
	    }
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	   public boolean startsWith(String prefix) {
	        TrieNode current = root;
	        
	        for(int i=0; i<prefix.length(); i++){
	            char ch = prefix.charAt(i);
	            TrieNode node = current.children[ch-'a'];
	            if(node!=null){
	                current = node;
	            }
	            else{
	                return false;
	            }
	        }
	        
	        return true;
	    }
	}
	    class TrieNode{
	            // stores address of next children (can be up max 26, a - z)
	        TrieNode [] children = new  TrieNode[26];
	        char val;
	        boolean endNode;
	    }  
	   

	/**
	 * Your Trie object will be instantiated and called as such:
	 * Trie obj = new Trie();
	 * obj.insert(word);
	 * boolean param_2 = obj.search(word);
	 * boolean param_3 = obj.startsWith(prefix);
	 */
