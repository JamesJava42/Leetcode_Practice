import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet1048 {
    public static void main(String[] args) {
        
        /*You are given an array of words where each word consists of lowercase English letters.

wordA is a predecessor of wordB if and only if we can insert exactly one letter 
anywhere in wordA without changing the order of the other characters to make it equal to wordB.

For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
A word chain is a sequence of words [word1, wo rd2, ..., wordk] with k >= 1, where word1 is
 a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially 
 a word chain with k == 1.

Return the length of the longest possible word chain with words chosen from the given list of words. */

/*Input: words = ["a","b","ba","bca","bda","bdca"]
Output: 4
Explanation: One of the longest word chains is ["a","ba","bda","bdca"]. */

String []words = {"a","b","ba","bca","bda","bdca"};
String  em ="";




    }
    private Map<Integer, List<String>> wordLengthMap;
private Map<String, Integer> memo;

public int longestStrChain(String[] words) {
	// store each word with its corresponding length
	wordLengthMap = new HashMap<>();
	for (String word: words) {
		wordLengthMap.putIfAbsent(word.length(), new ArrayList<>());
		wordLengthMap.get(word.length()).add(word);
	}

	int maxPath = 1;
	memo = new HashMap<>();
	for (String word: words) 
		maxPath = Math.max(maxPath, dfs(word));

	return maxPath;
}

private int dfs(String word) {
	if (!wordLengthMap.containsKey(word.length() + 1)) return 1; // if there are no words of the next length, we're done with this path.
	if (memo.containsKey(word)) return memo.get(word); // if we're computed this word before, return the result.

	int maxPath = 0;
	// for each word, find all words which are 1 letter longer and see if they are valid successors.
	List<String> nextWords = wordLengthMap.get(word.length() + 1);
	for (String nextWord: nextWords) 
		if (isOneOff(word, nextWord)) 
			maxPath = Math.max(maxPath, dfs(nextWord));
	
	memo.put(word, maxPath + 1); // store our result
	return memo.get(word);
}

// returns true if two strings differ by no more than 1 letter
private boolean isOneOff(String a, String b) {
	int count = 0;
	for (int i=0, j=0; i<b.length() && j<a.length() && count <= 1; i++) {
		if (a.charAt(j) != b.charAt(i)) count++;
		else j++;
	}
	return count <= 1;
}
}
