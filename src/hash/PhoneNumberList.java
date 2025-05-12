package hash;

import java.util.HashMap;
import java.util.Map;


public class PhoneNumberList {
    public static void main(String[] args) {
        Trie t = new Trie();
        String[] phone_book = {"119", "97674223", "1195524421"};

        for (String s : phone_book) {
            t.insert(s);
        }

        for (String s : phone_book) {
            t.startsWith(s);
        }
    }
}


// Trie 알고리즘
class TrieNode {
    Map<Character, TrieNode> childNode = new HashMap<>();
    boolean isEndOfWord;
}

class Trie {
    TrieNode root = new TrieNode();

    public void insert(String word){
        TrieNode currentNode = root;

        for (char c : word.toCharArray()) {
            currentNode = currentNode.childNode.computeIfAbsent(c, key -> root);
        }

        currentNode.isEndOfWord = true;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
        for (char c : prefix.toCharArray()) {
            currentNode = currentNode.childNode.get(c);
            if (currentNode == null) {
                return false;
            }
        }
        return true;
    }
}